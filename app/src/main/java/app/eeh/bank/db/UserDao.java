package app.eeh.bank.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import app.eeh.bank.db.table.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserId = new Property(1, String.class, "userId", false, "USER_ID");
        public final static Property NickName = new Property(2, String.class, "nickName", false, "NICK_NAME");
        public final static Property PassWord = new Property(3, String.class, "passWord", false, "PASS_WORD");
        public final static Property BindingQQ = new Property(4, String.class, "bindingQQ", false, "BINDING_QQ");
        public final static Property BindingWeChat = new Property(5, String.class, "bindingWeChat", false, "BINDING_WE_CHAT");
        public final static Property BindingEmail = new Property(6, String.class, "bindingEmail", false, "BINDING_EMAIL");
        public final static Property HeadPortrait = new Property(7, String.class, "headPortrait", false, "HEAD_PORTRAIT");
        public final static Property UserMessage = new Property(8, String.class, "userMessage", false, "USER_MESSAGE");
        public final static Property Enable = new Property(9, int.class, "enable", false, "ENABLE");
    }


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"USER_ID\" TEXT," + // 1: userId
                "\"NICK_NAME\" TEXT," + // 2: nickName
                "\"PASS_WORD\" TEXT," + // 3: passWord
                "\"BINDING_QQ\" TEXT," + // 4: bindingQQ
                "\"BINDING_WE_CHAT\" TEXT," + // 5: bindingWeChat
                "\"BINDING_EMAIL\" TEXT," + // 6: bindingEmail
                "\"HEAD_PORTRAIT\" TEXT," + // 7: headPortrait
                "\"USER_MESSAGE\" TEXT," + // 8: userMessage
                "\"ENABLE\" INTEGER NOT NULL );"); // 9: enable
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(2, userId);
        }
 
        String nickName = entity.getNickName();
        if (nickName != null) {
            stmt.bindString(3, nickName);
        }
 
        String passWord = entity.getPassWord();
        if (passWord != null) {
            stmt.bindString(4, passWord);
        }
 
        String bindingQQ = entity.getBindingQQ();
        if (bindingQQ != null) {
            stmt.bindString(5, bindingQQ);
        }
 
        String bindingWeChat = entity.getBindingWeChat();
        if (bindingWeChat != null) {
            stmt.bindString(6, bindingWeChat);
        }
 
        String bindingEmail = entity.getBindingEmail();
        if (bindingEmail != null) {
            stmt.bindString(7, bindingEmail);
        }
 
        String headPortrait = entity.getHeadPortrait();
        if (headPortrait != null) {
            stmt.bindString(8, headPortrait);
        }
 
        String userMessage = entity.getUserMessage();
        if (userMessage != null) {
            stmt.bindString(9, userMessage);
        }
        stmt.bindLong(10, entity.getEnable());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(2, userId);
        }
 
        String nickName = entity.getNickName();
        if (nickName != null) {
            stmt.bindString(3, nickName);
        }
 
        String passWord = entity.getPassWord();
        if (passWord != null) {
            stmt.bindString(4, passWord);
        }
 
        String bindingQQ = entity.getBindingQQ();
        if (bindingQQ != null) {
            stmt.bindString(5, bindingQQ);
        }
 
        String bindingWeChat = entity.getBindingWeChat();
        if (bindingWeChat != null) {
            stmt.bindString(6, bindingWeChat);
        }
 
        String bindingEmail = entity.getBindingEmail();
        if (bindingEmail != null) {
            stmt.bindString(7, bindingEmail);
        }
 
        String headPortrait = entity.getHeadPortrait();
        if (headPortrait != null) {
            stmt.bindString(8, headPortrait);
        }
 
        String userMessage = entity.getUserMessage();
        if (userMessage != null) {
            stmt.bindString(9, userMessage);
        }
        stmt.bindLong(10, entity.getEnable());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // nickName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // passWord
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // bindingQQ
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // bindingWeChat
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // bindingEmail
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // headPortrait
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // userMessage
            cursor.getInt(offset + 9) // enable
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNickName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPassWord(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setBindingQQ(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBindingWeChat(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setBindingEmail(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setHeadPortrait(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setUserMessage(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setEnable(cursor.getInt(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
