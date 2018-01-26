/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.thrift.gen.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-01-25")
public class Transaction implements org.apache.thrift.TBase<Transaction, Transaction._Fields>, java.io.Serializable, Cloneable, Comparable<Transaction> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Transaction");

  private static final org.apache.thrift.protocol.TField SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("source", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_FIELD_DESC = new org.apache.thrift.protocol.TField("target", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CURRENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("currency", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField FEE_FIELD_DESC = new org.apache.thrift.protocol.TField("fee", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("time", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField POOL_FIELD_DESC = new org.apache.thrift.protocol.TField("pool", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField NONCE_FIELD_DESC = new org.apache.thrift.protocol.TField("nonce", org.apache.thrift.protocol.TType.I64, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TransactionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TransactionTupleSchemeFactory();

  public java.lang.String source; // required
  public java.lang.String target; // required
  public java.lang.String currency; // required
  public Amount amount; // required
  public Amount fee; // required
  public long time; // required
  public long pool; // required
  public long nonce; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOURCE((short)1, "source"),
    TARGET((short)2, "target"),
    CURRENCY((short)3, "currency"),
    AMOUNT((short)4, "amount"),
    FEE((short)5, "fee"),
    TIME((short)6, "time"),
    POOL((short)7, "pool"),
    NONCE((short)8, "nonce");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SOURCE
          return SOURCE;
        case 2: // TARGET
          return TARGET;
        case 3: // CURRENCY
          return CURRENCY;
        case 4: // AMOUNT
          return AMOUNT;
        case 5: // FEE
          return FEE;
        case 6: // TIME
          return TIME;
        case 7: // POOL
          return POOL;
        case 8: // NONCE
          return NONCE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIME_ISSET_ID = 0;
  private static final int __POOL_ISSET_ID = 1;
  private static final int __NONCE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SOURCE, new org.apache.thrift.meta_data.FieldMetaData("source", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.TARGET, new org.apache.thrift.meta_data.FieldMetaData("target", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.CURRENCY, new org.apache.thrift.meta_data.FieldMetaData("currency", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Currency")));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Amount.class)));
    tmpMap.put(_Fields.FEE, new org.apache.thrift.meta_data.FieldMetaData("fee", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Amount.class)));
    tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("time", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.POOL, new org.apache.thrift.meta_data.FieldMetaData("pool", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NONCE, new org.apache.thrift.meta_data.FieldMetaData("nonce", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Transaction.class, metaDataMap);
  }

  public Transaction() {
    this.time = 0L;

    this.pool = 0L;

    this.nonce = 0L;

  }

  public Transaction(
    java.lang.String source,
    java.lang.String target,
    java.lang.String currency,
    Amount amount,
    Amount fee,
    long time,
    long pool,
    long nonce)
  {
    this();
    this.source = source;
    this.target = target;
    this.currency = currency;
    this.amount = amount;
    this.fee = fee;
    this.time = time;
    setTimeIsSet(true);
    this.pool = pool;
    setPoolIsSet(true);
    this.nonce = nonce;
    setNonceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Transaction(Transaction other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSource()) {
      this.source = other.source;
    }
    if (other.isSetTarget()) {
      this.target = other.target;
    }
    if (other.isSetCurrency()) {
      this.currency = other.currency;
    }
    if (other.isSetAmount()) {
      this.amount = new Amount(other.amount);
    }
    if (other.isSetFee()) {
      this.fee = new Amount(other.fee);
    }
    this.time = other.time;
    this.pool = other.pool;
    this.nonce = other.nonce;
  }

  public Transaction deepCopy() {
    return new Transaction(this);
  }

  @Override
  public void clear() {
    this.source = null;
    this.target = null;
    this.currency = null;
    this.amount = null;
    this.fee = null;
    this.time = 0L;

    this.pool = 0L;

    this.nonce = 0L;

  }

  public java.lang.String getSource() {
    return this.source;
  }

  public Transaction setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  public void unsetSource() {
    this.source = null;
  }

  /** Returns true if field source is set (has been assigned a value) and false otherwise */
  public boolean isSetSource() {
    return this.source != null;
  }

  public void setSourceIsSet(boolean value) {
    if (!value) {
      this.source = null;
    }
  }

  public java.lang.String getTarget() {
    return this.target;
  }

  public Transaction setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  public void unsetTarget() {
    this.target = null;
  }

  /** Returns true if field target is set (has been assigned a value) and false otherwise */
  public boolean isSetTarget() {
    return this.target != null;
  }

  public void setTargetIsSet(boolean value) {
    if (!value) {
      this.target = null;
    }
  }

  public java.lang.String getCurrency() {
    return this.currency;
  }

  public Transaction setCurrency(java.lang.String currency) {
    this.currency = currency;
    return this;
  }

  public void unsetCurrency() {
    this.currency = null;
  }

  /** Returns true if field currency is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrency() {
    return this.currency != null;
  }

  public void setCurrencyIsSet(boolean value) {
    if (!value) {
      this.currency = null;
    }
  }

  public Amount getAmount() {
    return this.amount;
  }

  public Transaction setAmount(Amount amount) {
    this.amount = amount;
    return this;
  }

  public void unsetAmount() {
    this.amount = null;
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return this.amount != null;
  }

  public void setAmountIsSet(boolean value) {
    if (!value) {
      this.amount = null;
    }
  }

  public Amount getFee() {
    return this.fee;
  }

  public Transaction setFee(Amount fee) {
    this.fee = fee;
    return this;
  }

  public void unsetFee() {
    this.fee = null;
  }

  /** Returns true if field fee is set (has been assigned a value) and false otherwise */
  public boolean isSetFee() {
    return this.fee != null;
  }

  public void setFeeIsSet(boolean value) {
    if (!value) {
      this.fee = null;
    }
  }

  public long getTime() {
    return this.time;
  }

  public Transaction setTime(long time) {
    this.time = time;
    setTimeIsSet(true);
    return this;
  }

  public void unsetTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  /** Returns true if field time is set (has been assigned a value) and false otherwise */
  public boolean isSetTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  public void setTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIME_ISSET_ID, value);
  }

  public long getPool() {
    return this.pool;
  }

  public Transaction setPool(long pool) {
    this.pool = pool;
    setPoolIsSet(true);
    return this;
  }

  public void unsetPool() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POOL_ISSET_ID);
  }

  /** Returns true if field pool is set (has been assigned a value) and false otherwise */
  public boolean isSetPool() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POOL_ISSET_ID);
  }

  public void setPoolIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POOL_ISSET_ID, value);
  }

  public long getNonce() {
    return this.nonce;
  }

  public Transaction setNonce(long nonce) {
    this.nonce = nonce;
    setNonceIsSet(true);
    return this;
  }

  public void unsetNonce() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NONCE_ISSET_ID);
  }

  /** Returns true if field nonce is set (has been assigned a value) and false otherwise */
  public boolean isSetNonce() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NONCE_ISSET_ID);
  }

  public void setNonceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NONCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SOURCE:
      if (value == null) {
        unsetSource();
      } else {
        setSource((java.lang.String)value);
      }
      break;

    case TARGET:
      if (value == null) {
        unsetTarget();
      } else {
        setTarget((java.lang.String)value);
      }
      break;

    case CURRENCY:
      if (value == null) {
        unsetCurrency();
      } else {
        setCurrency((java.lang.String)value);
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((Amount)value);
      }
      break;

    case FEE:
      if (value == null) {
        unsetFee();
      } else {
        setFee((Amount)value);
      }
      break;

    case TIME:
      if (value == null) {
        unsetTime();
      } else {
        setTime((java.lang.Long)value);
      }
      break;

    case POOL:
      if (value == null) {
        unsetPool();
      } else {
        setPool((java.lang.Long)value);
      }
      break;

    case NONCE:
      if (value == null) {
        unsetNonce();
      } else {
        setNonce((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SOURCE:
      return getSource();

    case TARGET:
      return getTarget();

    case CURRENCY:
      return getCurrency();

    case AMOUNT:
      return getAmount();

    case FEE:
      return getFee();

    case TIME:
      return getTime();

    case POOL:
      return getPool();

    case NONCE:
      return getNonce();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SOURCE:
      return isSetSource();
    case TARGET:
      return isSetTarget();
    case CURRENCY:
      return isSetCurrency();
    case AMOUNT:
      return isSetAmount();
    case FEE:
      return isSetFee();
    case TIME:
      return isSetTime();
    case POOL:
      return isSetPool();
    case NONCE:
      return isSetNonce();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Transaction)
      return this.equals((Transaction)that);
    return false;
  }

  public boolean equals(Transaction that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_source = true && this.isSetSource();
    boolean that_present_source = true && that.isSetSource();
    if (this_present_source || that_present_source) {
      if (!(this_present_source && that_present_source))
        return false;
      if (!this.source.equals(that.source))
        return false;
    }

    boolean this_present_target = true && this.isSetTarget();
    boolean that_present_target = true && that.isSetTarget();
    if (this_present_target || that_present_target) {
      if (!(this_present_target && that_present_target))
        return false;
      if (!this.target.equals(that.target))
        return false;
    }

    boolean this_present_currency = true && this.isSetCurrency();
    boolean that_present_currency = true && that.isSetCurrency();
    if (this_present_currency || that_present_currency) {
      if (!(this_present_currency && that_present_currency))
        return false;
      if (!this.currency.equals(that.currency))
        return false;
    }

    boolean this_present_amount = true && this.isSetAmount();
    boolean that_present_amount = true && that.isSetAmount();
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (!this.amount.equals(that.amount))
        return false;
    }

    boolean this_present_fee = true && this.isSetFee();
    boolean that_present_fee = true && that.isSetFee();
    if (this_present_fee || that_present_fee) {
      if (!(this_present_fee && that_present_fee))
        return false;
      if (!this.fee.equals(that.fee))
        return false;
    }

    boolean this_present_time = true;
    boolean that_present_time = true;
    if (this_present_time || that_present_time) {
      if (!(this_present_time && that_present_time))
        return false;
      if (this.time != that.time)
        return false;
    }

    boolean this_present_pool = true;
    boolean that_present_pool = true;
    if (this_present_pool || that_present_pool) {
      if (!(this_present_pool && that_present_pool))
        return false;
      if (this.pool != that.pool)
        return false;
    }

    boolean this_present_nonce = true;
    boolean that_present_nonce = true;
    if (this_present_nonce || that_present_nonce) {
      if (!(this_present_nonce && that_present_nonce))
        return false;
      if (this.nonce != that.nonce)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSource()) ? 131071 : 524287);
    if (isSetSource())
      hashCode = hashCode * 8191 + source.hashCode();

    hashCode = hashCode * 8191 + ((isSetTarget()) ? 131071 : 524287);
    if (isSetTarget())
      hashCode = hashCode * 8191 + target.hashCode();

    hashCode = hashCode * 8191 + ((isSetCurrency()) ? 131071 : 524287);
    if (isSetCurrency())
      hashCode = hashCode * 8191 + currency.hashCode();

    hashCode = hashCode * 8191 + ((isSetAmount()) ? 131071 : 524287);
    if (isSetAmount())
      hashCode = hashCode * 8191 + amount.hashCode();

    hashCode = hashCode * 8191 + ((isSetFee()) ? 131071 : 524287);
    if (isSetFee())
      hashCode = hashCode * 8191 + fee.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(time);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(pool);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(nonce);

    return hashCode;
  }

  @Override
  public int compareTo(Transaction other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSource()).compareTo(other.isSetSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.source, other.source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTarget()).compareTo(other.isSetTarget());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTarget()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.target, other.target);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCurrency()).compareTo(other.isSetCurrency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currency, other.currency);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAmount()).compareTo(other.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount, other.amount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFee()).compareTo(other.isSetFee());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFee()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fee, other.fee);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTime()).compareTo(other.isSetTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time, other.time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPool()).compareTo(other.isSetPool());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPool()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pool, other.pool);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNonce()).compareTo(other.isSetNonce());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNonce()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nonce, other.nonce);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Transaction(");
    boolean first = true;

    sb.append("source:");
    if (this.source == null) {
      sb.append("null");
    } else {
      sb.append(this.source);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("target:");
    if (this.target == null) {
      sb.append("null");
    } else {
      sb.append(this.target);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("currency:");
    if (this.currency == null) {
      sb.append("null");
    } else {
      sb.append(this.currency);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    if (this.amount == null) {
      sb.append("null");
    } else {
      sb.append(this.amount);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fee:");
    if (this.fee == null) {
      sb.append("null");
    } else {
      sb.append(this.fee);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("time:");
    sb.append(this.time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pool:");
    sb.append(this.pool);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nonce:");
    sb.append(this.nonce);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (source == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'source' was not present! Struct: " + toString());
    }
    if (target == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'target' was not present! Struct: " + toString());
    }
    if (currency == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'currency' was not present! Struct: " + toString());
    }
    if (amount == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'amount' was not present! Struct: " + toString());
    }
    if (fee == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fee' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'time' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'pool' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'nonce' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (amount != null) {
      amount.validate();
    }
    if (fee != null) {
      fee.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TransactionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TransactionStandardScheme getScheme() {
      return new TransactionStandardScheme();
    }
  }

  private static class TransactionStandardScheme extends org.apache.thrift.scheme.StandardScheme<Transaction> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Transaction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.source = iprot.readString();
              struct.setSourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.target = iprot.readString();
              struct.setTargetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CURRENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currency = iprot.readString();
              struct.setCurrencyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.amount = new Amount();
              struct.amount.read(iprot);
              struct.setAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // FEE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fee = new Amount();
              struct.fee.read(iprot);
              struct.setFeeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.time = iprot.readI64();
              struct.setTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // POOL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.pool = iprot.readI64();
              struct.setPoolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // NONCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.nonce = iprot.readI64();
              struct.setNonceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetTime()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'time' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetPool()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'pool' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetNonce()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'nonce' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Transaction struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.source != null) {
        oprot.writeFieldBegin(SOURCE_FIELD_DESC);
        oprot.writeString(struct.source);
        oprot.writeFieldEnd();
      }
      if (struct.target != null) {
        oprot.writeFieldBegin(TARGET_FIELD_DESC);
        oprot.writeString(struct.target);
        oprot.writeFieldEnd();
      }
      if (struct.currency != null) {
        oprot.writeFieldBegin(CURRENCY_FIELD_DESC);
        oprot.writeString(struct.currency);
        oprot.writeFieldEnd();
      }
      if (struct.amount != null) {
        oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
        struct.amount.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.fee != null) {
        oprot.writeFieldBegin(FEE_FIELD_DESC);
        struct.fee.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIME_FIELD_DESC);
      oprot.writeI64(struct.time);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(POOL_FIELD_DESC);
      oprot.writeI64(struct.pool);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NONCE_FIELD_DESC);
      oprot.writeI64(struct.nonce);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TransactionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TransactionTupleScheme getScheme() {
      return new TransactionTupleScheme();
    }
  }

  private static class TransactionTupleScheme extends org.apache.thrift.scheme.TupleScheme<Transaction> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Transaction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.source);
      oprot.writeString(struct.target);
      oprot.writeString(struct.currency);
      struct.amount.write(oprot);
      struct.fee.write(oprot);
      oprot.writeI64(struct.time);
      oprot.writeI64(struct.pool);
      oprot.writeI64(struct.nonce);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Transaction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.source = iprot.readString();
      struct.setSourceIsSet(true);
      struct.target = iprot.readString();
      struct.setTargetIsSet(true);
      struct.currency = iprot.readString();
      struct.setCurrencyIsSet(true);
      struct.amount = new Amount();
      struct.amount.read(iprot);
      struct.setAmountIsSet(true);
      struct.fee = new Amount();
      struct.fee.read(iprot);
      struct.setFeeIsSet(true);
      struct.time = iprot.readI64();
      struct.setTimeIsSet(true);
      struct.pool = iprot.readI64();
      struct.setPoolIsSet(true);
      struct.nonce = iprot.readI64();
      struct.setNonceIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

