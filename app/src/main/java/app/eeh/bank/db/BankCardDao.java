package app.eeh.bank.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import app.eeh.bank.db.table.BankCard;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BANK_CARD".
*/
public class BankCardDao extends AbstractDao<BankCard, Long> {

    public static final String TABLENAME = "BANK_CARD";

    /**
     * Properties of entity BankCard.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property BankName = new Property(1, String.class, "bankName", false, "BANK_NAME");
        public final static Property BankNumber = new Property(2, int.class, "bankNumber", false, "BANK_NUMBER");
        public final static Property MaxLines = new Property(3, int.class, "maxLines", false, "MAX_LINES");
        public final static Property BillingData = new Property(4, String.class, "billingData", false, "BILLING_DATA");
        public final static Property PayBackData = new Property(5, String.class, "payBackData", false, "PAY_BACK_DATA");
        public final static Property CardHolder = new Property(6, String.class, "cardHolder", false, "CARD_HOLDER");
        public final static Property SafeCode = new Property(7, int.class, "safeCode", false, "SAFE_CODE");
        public final static Property EffectiveData = new Property(8, String.class, "effectiveData", false, "EFFECTIVE_DATA");
        public final static Property AnnualFeeRules = new Property(9, String.class, "annualFeeRules", false, "ANNUAL_FEE_RULES");
        public final static Property NowDebt = new Property(10, int.class, "nowDebt", false, "NOW_DEBT");
        public final static Property HasBill = new Property(11, int.class, "hasBill", false, "HAS_BILL");
        public final static Property NegtiveBill = new Property(12, int.class, "negtiveBill", false, "NEGTIVE_BILL");
        public final static Property MinLines = new Property(13, int.class, "minLines", false, "MIN_LINES");
        public final static Property Enable = new Property(14, int.class, "enable", false, "ENABLE");
        public final static Property UserId = new Property(15, int.class, "userId", false, "USER_ID");
    }


    public BankCardDao(DaoConfig config) {
        super(config);
    }
    
    public BankCardDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BANK_CARD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BANK_NAME\" TEXT," + // 1: bankName
                "\"BANK_NUMBER\" INTEGER NOT NULL ," + // 2: bankNumber
                "\"MAX_LINES\" INTEGER NOT NULL ," + // 3: maxLines
                "\"BILLING_DATA\" TEXT," + // 4: billingData
                "\"PAY_BACK_DATA\" TEXT," + // 5: payBackData
                "\"CARD_HOLDER\" TEXT," + // 6: cardHolder
                "\"SAFE_CODE\" INTEGER NOT NULL ," + // 7: safeCode
                "\"EFFECTIVE_DATA\" TEXT," + // 8: effectiveData
                "\"ANNUAL_FEE_RULES\" TEXT," + // 9: annualFeeRules
                "\"NOW_DEBT\" INTEGER NOT NULL ," + // 10: nowDebt
                "\"HAS_BILL\" INTEGER NOT NULL ," + // 11: hasBill
                "\"NEGTIVE_BILL\" INTEGER NOT NULL ," + // 12: negtiveBill
                "\"MIN_LINES\" INTEGER NOT NULL ," + // 13: minLines
                "\"ENABLE\" INTEGER NOT NULL ," + // 14: enable
                "\"USER_ID\" INTEGER NOT NULL );"); // 15: userId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BANK_CARD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BankCard entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String bankName = entity.getBankName();
        if (bankName != null) {
            stmt.bindString(2, bankName);
        }
        stmt.bindLong(3, entity.getBankNumber());
        stmt.bindLong(4, entity.getMaxLines());
 
        String billingData = entity.getBillingData();
        if (billingData != null) {
            stmt.bindString(5, billingData);
        }
 
        String payBackData = entity.getPayBackData();
        if (payBackData != null) {
            stmt.bindString(6, payBackData);
        }
 
        String cardHolder = entity.getCardHolder();
        if (cardHolder != null) {
            stmt.bindString(7, cardHolder);
        }
        stmt.bindLong(8, entity.getSafeCode());
 
        String effectiveData = entity.getEffectiveData();
        if (effectiveData != null) {
            stmt.bindString(9, effectiveData);
        }
 
        String annualFeeRules = entity.getAnnualFeeRules();
        if (annualFeeRules != null) {
            stmt.bindString(10, annualFeeRules);
        }
        stmt.bindLong(11, entity.getNowDebt());
        stmt.bindLong(12, entity.getHasBill());
        stmt.bindLong(13, entity.getNegtiveBill());
        stmt.bindLong(14, entity.getMinLines());
        stmt.bindLong(15, entity.getEnable());
        stmt.bindLong(16, entity.getUserId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BankCard entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String bankName = entity.getBankName();
        if (bankName != null) {
            stmt.bindString(2, bankName);
        }
        stmt.bindLong(3, entity.getBankNumber());
        stmt.bindLong(4, entity.getMaxLines());
 
        String billingData = entity.getBillingData();
        if (billingData != null) {
            stmt.bindString(5, billingData);
        }
 
        String payBackData = entity.getPayBackData();
        if (payBackData != null) {
            stmt.bindString(6, payBackData);
        }
 
        String cardHolder = entity.getCardHolder();
        if (cardHolder != null) {
            stmt.bindString(7, cardHolder);
        }
        stmt.bindLong(8, entity.getSafeCode());
 
        String effectiveData = entity.getEffectiveData();
        if (effectiveData != null) {
            stmt.bindString(9, effectiveData);
        }
 
        String annualFeeRules = entity.getAnnualFeeRules();
        if (annualFeeRules != null) {
            stmt.bindString(10, annualFeeRules);
        }
        stmt.bindLong(11, entity.getNowDebt());
        stmt.bindLong(12, entity.getHasBill());
        stmt.bindLong(13, entity.getNegtiveBill());
        stmt.bindLong(14, entity.getMinLines());
        stmt.bindLong(15, entity.getEnable());
        stmt.bindLong(16, entity.getUserId());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BankCard readEntity(Cursor cursor, int offset) {
        BankCard entity = new BankCard( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // bankName
            cursor.getInt(offset + 2), // bankNumber
            cursor.getInt(offset + 3), // maxLines
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // billingData
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // payBackData
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // cardHolder
            cursor.getInt(offset + 7), // safeCode
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // effectiveData
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // annualFeeRules
            cursor.getInt(offset + 10), // nowDebt
            cursor.getInt(offset + 11), // hasBill
            cursor.getInt(offset + 12), // negtiveBill
            cursor.getInt(offset + 13), // minLines
            cursor.getInt(offset + 14), // enable
            cursor.getInt(offset + 15) // userId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BankCard entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBankName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBankNumber(cursor.getInt(offset + 2));
        entity.setMaxLines(cursor.getInt(offset + 3));
        entity.setBillingData(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPayBackData(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCardHolder(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSafeCode(cursor.getInt(offset + 7));
        entity.setEffectiveData(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAnnualFeeRules(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setNowDebt(cursor.getInt(offset + 10));
        entity.setHasBill(cursor.getInt(offset + 11));
        entity.setNegtiveBill(cursor.getInt(offset + 12));
        entity.setMinLines(cursor.getInt(offset + 13));
        entity.setEnable(cursor.getInt(offset + 14));
        entity.setUserId(cursor.getInt(offset + 15));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BankCard entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BankCard entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BankCard entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
