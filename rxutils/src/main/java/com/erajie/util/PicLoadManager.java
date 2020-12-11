package com.erajie.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;


/**
 * 图片加载工具类,屏蔽底层图片加载框架
 * @version 1.0
 * @author： EraJieZhang
 * @date：2020年11月23日10点49分
 */
public class PicLoadManager {
    public static LoadBuilder with(Activity activity){
        return new LoadBuilder(activity);
    }

    public static LoadBuilder with(Fragment fragment){
        return new LoadBuilder(fragment);
    }

    public static LoadBuilder with(Context context){
        return new LoadBuilder(context);
    }

    public static class LoadBuilder{

        private Context context;
        private Activity activity;
        private Fragment fragment;

        private int defImgId;//如果不设置loadingimg则用这个图片当做loadingimg
        private int imgSize;//置顶要加载的图片大小
        private int loadingImgId;
        private String url;
        private boolean roundImg;
        private int corner;
        private int resId;//加载本地图片
        private boolean skipMemoryCache = false;

        public LoadBuilder setResId(int resId) {
            this.resId = resId;
            return this;
        }

        public void into(ImageView imageView){
            RequestManager glideManager = null;
            if (context != null){
                glideManager =  Glide.with(context);
            }else if (activity != null){
                glideManager =  Glide.with(activity);
            }else if (fragment != null){
                glideManager =  Glide.with(fragment);
            }
            if (glideManager == null){
                return;
            }
            if (resId != 0){
                glideManager.load(resId).into(imageView);
                return;
            }
            url = url == null ? "" : url;
            RequestBuilder<Drawable> requestBuilder = glideManager.load(url);
            RequestOptions options = new RequestOptions();
            if (defImgId > 0){
                options = options.error(defImgId);
            }
            if (loadingImgId > 0){
                options = options.placeholder(loadingImgId);
            }else if (defImgId > 0){
                options = options.placeholder(defImgId);
            }
            if (imgSize > 0){
                options = options.override(imgSize);
            }
            if (roundImg){
                options = options.circleCrop();
            }
            if (corner > 0){
                options = options.transform(new RoundedCorners(corner));
            }
            if (skipMemoryCache){
                options.diskCacheStrategy(DiskCacheStrategy.NONE);
                options.skipMemoryCache(true);
            }
            requestBuilder.apply(options).into(imageView);
        }

        public LoadBuilder setCorner(int corner) {
            this.corner = corner;
            return this;
        }

        public LoadBuilder setDefImgId(int defImgId) {
            this.defImgId = defImgId;
            return this;
        }

        public LoadBuilder setLoadingImgId(int loadingImgId) {
            this.loadingImgId = loadingImgId;
            return this;
        }
        public LoadBuilder setImgSize(int imgSize) {
            this.imgSize = imgSize;
            return this;
        }

        public LoadBuilder setRoundImg(boolean roundImg) {
            this.roundImg = roundImg;
            return this;
        }

        public LoadBuilder setDiskCacheStrategy(boolean skipMemoryCache){
            this.skipMemoryCache = skipMemoryCache;
            return this;
        }

        public void loadBitmap(LoadBitmapListener listener) {
            if (listener == null){
                return;
            }
            RequestManager glideManager = null;
            if (context != null){
                glideManager =  Glide.with(context);
            }else if (activity != null){
                glideManager =  Glide.with(activity);
            }else if (fragment != null){
                glideManager =  Glide.with(fragment);
            }
            if (glideManager == null){
                return;
            }
            url = (resId != 0 || url == null) ? "" : url;//resId优先
            GlideUrl glideUrl = null;
            RequestBuilder<Bitmap> bitmapRequestBuilder = glideManager.asBitmap();
            if (imgSize > 0){
                bitmapRequestBuilder = bitmapRequestBuilder.apply(new RequestOptions().override(imgSize).fitCenter());
            }
            bitmapRequestBuilder.load(resId != 0 ? resId : url).listener(new RequestListener<Bitmap>() {
                @Override
                public boolean onLoadFailed(GlideException e, Object model, Target<Bitmap> target, boolean isFirstResource) {
                    listener.onLoadFailed(new Exception(e));
                    return false;
                }

                @Override
                public boolean onResourceReady(Bitmap resource, Object model, Target<Bitmap> target, com.bumptech.glide.load.DataSource dataSource, boolean isFirstResource) {
                    listener.onResourceReady(resource);
                    return false;
                }
            }).submit();
        }


        private LoadBuilder(Context context){
            this.context = context;
        }

        private LoadBuilder(Activity activity){
            this.activity = activity;
        }

        private LoadBuilder(Fragment fragment){
            this.fragment = fragment;
        }

        public LoadBuilder setUrl(String url) {
            this.url = url;
            return this;
        }
    }
    public interface LoadBitmapListener{
        void onLoadFailed(Exception e) ;
        void onResourceReady(Bitmap resource);
    }
}

