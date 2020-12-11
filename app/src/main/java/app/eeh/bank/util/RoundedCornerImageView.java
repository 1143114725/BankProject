package app.eeh.bank.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author EraJieZhang
 * @data 2020/11/26
 */

public class RoundedCornerImageView extends androidx.appcompat.widget.AppCompatImageView {

    float width,height;

    public RoundedCornerImageView(Context context) {
        this(context, null);
    }

    public RoundedCornerImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RoundedCornerImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        width = getWidth();
        height = getHeight();
    }

    private int cornerTopLeftRadius = 0;
    private int cornerTopRightRadius = 0;
    private int cornerBottomLeftRadius = 0;
    private int cornerBottomRightRadius = 0;

    public void setCornerRadius(int cornerRadius) {
        cornerRadius = checkParameters(cornerRadius);
        this.cornerTopLeftRadius = cornerRadius;
        this.cornerTopRightRadius = cornerRadius;
        this.cornerBottomLeftRadius = cornerRadius;
        this.cornerBottomRightRadius = cornerRadius;
    }

    public void setCornerRadius(int cornerTopLeftRadius,int cornerTopRightRadius,int cornerBottomLeftRadius,int cornerBottomRightRadius) {
        this.cornerTopLeftRadius = checkParameters(cornerTopLeftRadius);
        this.cornerTopRightRadius = checkParameters(cornerTopRightRadius);
        this.cornerBottomLeftRadius = checkParameters(cornerBottomLeftRadius);
        this.cornerBottomRightRadius = checkParameters(cornerBottomRightRadius);
    }

    private int checkParameters(int radius) {
        if (radius < 0) {
            radius = 0;
        }
        return radius;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Path path = new Path();
        path.moveTo(cornerTopLeftRadius, 0);
        path.lineTo(width - cornerTopRightRadius, 0);
        path.quadTo(width, 0, width, cornerTopRightRadius);
        path.lineTo(width, height - cornerBottomRightRadius);
        path.quadTo(width, height, width - cornerBottomRightRadius, height);
        path.lineTo(cornerBottomLeftRadius, height);
        path.quadTo(0, height, 0, height - cornerBottomLeftRadius);
        path.lineTo(0, cornerTopLeftRadius);
        path.quadTo(0, 0, cornerTopLeftRadius, 0);
        canvas.clipPath(path);

        super.onDraw(canvas);
    }
}
