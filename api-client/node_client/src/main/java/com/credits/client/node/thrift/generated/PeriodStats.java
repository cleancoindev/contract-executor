/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-12-24")
public class PeriodStats implements org.apache.thrift.TBase<PeriodStats, PeriodStats._Fields>, java.io.Serializable, Cloneable, Comparable<PeriodStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PeriodStats");

  private static final org.apache.thrift.protocol.TField PERIOD_DURATION_FIELD_DESC = new org.apache.thrift.protocol.TField("periodDuration", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField POOLS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("poolsCount", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TRANSACTIONS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("transactionsCount", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField BALANCE_PER_CURRENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("balancePerCurrency", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField SMART_CONTRACTS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("smartContractsCount", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField TRANSACTIONS_SMART_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("transactionsSmartCount", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PeriodStatsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PeriodStatsTupleSchemeFactory();

  public long periodDuration; // required
  public int poolsCount; // required
  public int transactionsCount; // required
  public java.util.Map<java.lang.Byte,CumulativeAmount> balancePerCurrency; // required
  public int smartContractsCount; // required
  public int transactionsSmartCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PERIOD_DURATION((short)1, "periodDuration"),
    POOLS_COUNT((short)2, "poolsCount"),
    TRANSACTIONS_COUNT((short)3, "transactionsCount"),
    BALANCE_PER_CURRENCY((short)4, "balancePerCurrency"),
    SMART_CONTRACTS_COUNT((short)5, "smartContractsCount"),
    TRANSACTIONS_SMART_COUNT((short)6, "transactionsSmartCount");

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
        case 1: // PERIOD_DURATION
          return PERIOD_DURATION;
        case 2: // POOLS_COUNT
          return POOLS_COUNT;
        case 3: // TRANSACTIONS_COUNT
          return TRANSACTIONS_COUNT;
        case 4: // BALANCE_PER_CURRENCY
          return BALANCE_PER_CURRENCY;
        case 5: // SMART_CONTRACTS_COUNT
          return SMART_CONTRACTS_COUNT;
        case 6: // TRANSACTIONS_SMART_COUNT
          return TRANSACTIONS_SMART_COUNT;
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
  private static final int __PERIODDURATION_ISSET_ID = 0;
  private static final int __POOLSCOUNT_ISSET_ID = 1;
  private static final int __TRANSACTIONSCOUNT_ISSET_ID = 2;
  private static final int __SMARTCONTRACTSCOUNT_ISSET_ID = 3;
  private static final int __TRANSACTIONSSMARTCOUNT_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERIOD_DURATION, new org.apache.thrift.meta_data.FieldMetaData("periodDuration", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Time")));
    tmpMap.put(_Fields.POOLS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("poolsCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Count")));
    tmpMap.put(_Fields.TRANSACTIONS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("transactionsCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Count")));
    tmpMap.put(_Fields.BALANCE_PER_CURRENCY, new org.apache.thrift.meta_data.FieldMetaData("balancePerCurrency", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.MAP        , "Total")));
    tmpMap.put(_Fields.SMART_CONTRACTS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("smartContractsCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Count")));
    tmpMap.put(_Fields.TRANSACTIONS_SMART_COUNT, new org.apache.thrift.meta_data.FieldMetaData("transactionsSmartCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Count")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PeriodStats.class, metaDataMap);
  }

  public PeriodStats() {
  }

  public PeriodStats(
    long periodDuration,
    int poolsCount,
    int transactionsCount,
    java.util.Map<java.lang.Byte,CumulativeAmount> balancePerCurrency,
    int smartContractsCount,
    int transactionsSmartCount)
  {
    this();
    this.periodDuration = periodDuration;
    setPeriodDurationIsSet(true);
    this.poolsCount = poolsCount;
    setPoolsCountIsSet(true);
    this.transactionsCount = transactionsCount;
    setTransactionsCountIsSet(true);
    this.balancePerCurrency = balancePerCurrency;
    this.smartContractsCount = smartContractsCount;
    setSmartContractsCountIsSet(true);
    this.transactionsSmartCount = transactionsSmartCount;
    setTransactionsSmartCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PeriodStats(PeriodStats other) {
    __isset_bitfield = other.__isset_bitfield;
    this.periodDuration = other.periodDuration;
    this.poolsCount = other.poolsCount;
    this.transactionsCount = other.transactionsCount;
    if (other.isSetBalancePerCurrency()) {
      java.util.Map<java.lang.Byte,CumulativeAmount> __this__balancePerCurrency = new java.util.HashMap<java.lang.Byte,CumulativeAmount>(other.balancePerCurrency.size());
      for (java.util.Map.Entry<java.lang.Byte, CumulativeAmount> other_element : other.balancePerCurrency.entrySet()) {

        java.lang.Byte other_element_key = other_element.getKey();
        CumulativeAmount other_element_value = other_element.getValue();

        java.lang.Byte __this__balancePerCurrency_copy_key = other_element_key;

        CumulativeAmount __this__balancePerCurrency_copy_value = new CumulativeAmount(other_element_value);

        __this__balancePerCurrency.put(__this__balancePerCurrency_copy_key, __this__balancePerCurrency_copy_value);
      }
      this.balancePerCurrency = __this__balancePerCurrency;
    }
    this.smartContractsCount = other.smartContractsCount;
    this.transactionsSmartCount = other.transactionsSmartCount;
  }

  public PeriodStats deepCopy() {
    return new PeriodStats(this);
  }

  @Override
  public void clear() {
    setPeriodDurationIsSet(false);
    this.periodDuration = 0;
    setPoolsCountIsSet(false);
    this.poolsCount = 0;
    setTransactionsCountIsSet(false);
    this.transactionsCount = 0;
    this.balancePerCurrency = null;
    setSmartContractsCountIsSet(false);
    this.smartContractsCount = 0;
    setTransactionsSmartCountIsSet(false);
    this.transactionsSmartCount = 0;
  }

  public long getPeriodDuration() {
    return this.periodDuration;
  }

  public PeriodStats setPeriodDuration(long periodDuration) {
    this.periodDuration = periodDuration;
    setPeriodDurationIsSet(true);
    return this;
  }

  public void unsetPeriodDuration() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PERIODDURATION_ISSET_ID);
  }

  /** Returns true if field periodDuration is set (has been assigned a value) and false otherwise */
  public boolean isSetPeriodDuration() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PERIODDURATION_ISSET_ID);
  }

  public void setPeriodDurationIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PERIODDURATION_ISSET_ID, value);
  }

  public int getPoolsCount() {
    return this.poolsCount;
  }

  public PeriodStats setPoolsCount(int poolsCount) {
    this.poolsCount = poolsCount;
    setPoolsCountIsSet(true);
    return this;
  }

  public void unsetPoolsCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POOLSCOUNT_ISSET_ID);
  }

  /** Returns true if field poolsCount is set (has been assigned a value) and false otherwise */
  public boolean isSetPoolsCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POOLSCOUNT_ISSET_ID);
  }

  public void setPoolsCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POOLSCOUNT_ISSET_ID, value);
  }

  public int getTransactionsCount() {
    return this.transactionsCount;
  }

  public PeriodStats setTransactionsCount(int transactionsCount) {
    this.transactionsCount = transactionsCount;
    setTransactionsCountIsSet(true);
    return this;
  }

  public void unsetTransactionsCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRANSACTIONSCOUNT_ISSET_ID);
  }

  /** Returns true if field transactionsCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTransactionsCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRANSACTIONSCOUNT_ISSET_ID);
  }

  public void setTransactionsCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRANSACTIONSCOUNT_ISSET_ID, value);
  }

  public int getBalancePerCurrencySize() {
    return (this.balancePerCurrency == null) ? 0 : this.balancePerCurrency.size();
  }

  public void putToBalancePerCurrency(byte key, CumulativeAmount val) {
    if (this.balancePerCurrency == null) {
      this.balancePerCurrency = new java.util.HashMap<java.lang.Byte,CumulativeAmount>();
    }
    this.balancePerCurrency.put(key, val);
  }

  public java.util.Map<java.lang.Byte,CumulativeAmount> getBalancePerCurrency() {
    return this.balancePerCurrency;
  }

  public PeriodStats setBalancePerCurrency(java.util.Map<java.lang.Byte,CumulativeAmount> balancePerCurrency) {
    this.balancePerCurrency = balancePerCurrency;
    return this;
  }

  public void unsetBalancePerCurrency() {
    this.balancePerCurrency = null;
  }

  /** Returns true if field balancePerCurrency is set (has been assigned a value) and false otherwise */
  public boolean isSetBalancePerCurrency() {
    return this.balancePerCurrency != null;
  }

  public void setBalancePerCurrencyIsSet(boolean value) {
    if (!value) {
      this.balancePerCurrency = null;
    }
  }

  public int getSmartContractsCount() {
    return this.smartContractsCount;
  }

  public PeriodStats setSmartContractsCount(int smartContractsCount) {
    this.smartContractsCount = smartContractsCount;
    setSmartContractsCountIsSet(true);
    return this;
  }

  public void unsetSmartContractsCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SMARTCONTRACTSCOUNT_ISSET_ID);
  }

  /** Returns true if field smartContractsCount is set (has been assigned a value) and false otherwise */
  public boolean isSetSmartContractsCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SMARTCONTRACTSCOUNT_ISSET_ID);
  }

  public void setSmartContractsCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SMARTCONTRACTSCOUNT_ISSET_ID, value);
  }

  public int getTransactionsSmartCount() {
    return this.transactionsSmartCount;
  }

  public PeriodStats setTransactionsSmartCount(int transactionsSmartCount) {
    this.transactionsSmartCount = transactionsSmartCount;
    setTransactionsSmartCountIsSet(true);
    return this;
  }

  public void unsetTransactionsSmartCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRANSACTIONSSMARTCOUNT_ISSET_ID);
  }

  /** Returns true if field transactionsSmartCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTransactionsSmartCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRANSACTIONSSMARTCOUNT_ISSET_ID);
  }

  public void setTransactionsSmartCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRANSACTIONSSMARTCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PERIOD_DURATION:
      if (value == null) {
        unsetPeriodDuration();
      } else {
        setPeriodDuration((java.lang.Long)value);
      }
      break;

    case POOLS_COUNT:
      if (value == null) {
        unsetPoolsCount();
      } else {
        setPoolsCount((java.lang.Integer)value);
      }
      break;

    case TRANSACTIONS_COUNT:
      if (value == null) {
        unsetTransactionsCount();
      } else {
        setTransactionsCount((java.lang.Integer)value);
      }
      break;

    case BALANCE_PER_CURRENCY:
      if (value == null) {
        unsetBalancePerCurrency();
      } else {
        setBalancePerCurrency((java.util.Map<java.lang.Byte,CumulativeAmount>)value);
      }
      break;

    case SMART_CONTRACTS_COUNT:
      if (value == null) {
        unsetSmartContractsCount();
      } else {
        setSmartContractsCount((java.lang.Integer)value);
      }
      break;

    case TRANSACTIONS_SMART_COUNT:
      if (value == null) {
        unsetTransactionsSmartCount();
      } else {
        setTransactionsSmartCount((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PERIOD_DURATION:
      return getPeriodDuration();

    case POOLS_COUNT:
      return getPoolsCount();

    case TRANSACTIONS_COUNT:
      return getTransactionsCount();

    case BALANCE_PER_CURRENCY:
      return getBalancePerCurrency();

    case SMART_CONTRACTS_COUNT:
      return getSmartContractsCount();

    case TRANSACTIONS_SMART_COUNT:
      return getTransactionsSmartCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PERIOD_DURATION:
      return isSetPeriodDuration();
    case POOLS_COUNT:
      return isSetPoolsCount();
    case TRANSACTIONS_COUNT:
      return isSetTransactionsCount();
    case BALANCE_PER_CURRENCY:
      return isSetBalancePerCurrency();
    case SMART_CONTRACTS_COUNT:
      return isSetSmartContractsCount();
    case TRANSACTIONS_SMART_COUNT:
      return isSetTransactionsSmartCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PeriodStats)
      return this.equals((PeriodStats)that);
    return false;
  }

  public boolean equals(PeriodStats that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_periodDuration = true;
    boolean that_present_periodDuration = true;
    if (this_present_periodDuration || that_present_periodDuration) {
      if (!(this_present_periodDuration && that_present_periodDuration))
        return false;
      if (this.periodDuration != that.periodDuration)
        return false;
    }

    boolean this_present_poolsCount = true;
    boolean that_present_poolsCount = true;
    if (this_present_poolsCount || that_present_poolsCount) {
      if (!(this_present_poolsCount && that_present_poolsCount))
        return false;
      if (this.poolsCount != that.poolsCount)
        return false;
    }

    boolean this_present_transactionsCount = true;
    boolean that_present_transactionsCount = true;
    if (this_present_transactionsCount || that_present_transactionsCount) {
      if (!(this_present_transactionsCount && that_present_transactionsCount))
        return false;
      if (this.transactionsCount != that.transactionsCount)
        return false;
    }

    boolean this_present_balancePerCurrency = true && this.isSetBalancePerCurrency();
    boolean that_present_balancePerCurrency = true && that.isSetBalancePerCurrency();
    if (this_present_balancePerCurrency || that_present_balancePerCurrency) {
      if (!(this_present_balancePerCurrency && that_present_balancePerCurrency))
        return false;
      if (!this.balancePerCurrency.equals(that.balancePerCurrency))
        return false;
    }

    boolean this_present_smartContractsCount = true;
    boolean that_present_smartContractsCount = true;
    if (this_present_smartContractsCount || that_present_smartContractsCount) {
      if (!(this_present_smartContractsCount && that_present_smartContractsCount))
        return false;
      if (this.smartContractsCount != that.smartContractsCount)
        return false;
    }

    boolean this_present_transactionsSmartCount = true;
    boolean that_present_transactionsSmartCount = true;
    if (this_present_transactionsSmartCount || that_present_transactionsSmartCount) {
      if (!(this_present_transactionsSmartCount && that_present_transactionsSmartCount))
        return false;
      if (this.transactionsSmartCount != that.transactionsSmartCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(periodDuration);

    hashCode = hashCode * 8191 + poolsCount;

    hashCode = hashCode * 8191 + transactionsCount;

    hashCode = hashCode * 8191 + ((isSetBalancePerCurrency()) ? 131071 : 524287);
    if (isSetBalancePerCurrency())
      hashCode = hashCode * 8191 + balancePerCurrency.hashCode();

    hashCode = hashCode * 8191 + smartContractsCount;

    hashCode = hashCode * 8191 + transactionsSmartCount;

    return hashCode;
  }

  @Override
  public int compareTo(PeriodStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPeriodDuration()).compareTo(other.isSetPeriodDuration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPeriodDuration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.periodDuration, other.periodDuration);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPoolsCount()).compareTo(other.isSetPoolsCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoolsCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.poolsCount, other.poolsCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTransactionsCount()).compareTo(other.isSetTransactionsCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransactionsCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transactionsCount, other.transactionsCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBalancePerCurrency()).compareTo(other.isSetBalancePerCurrency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBalancePerCurrency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.balancePerCurrency, other.balancePerCurrency);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSmartContractsCount()).compareTo(other.isSetSmartContractsCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSmartContractsCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.smartContractsCount, other.smartContractsCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTransactionsSmartCount()).compareTo(other.isSetTransactionsSmartCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransactionsSmartCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transactionsSmartCount, other.transactionsSmartCount);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PeriodStats(");
    boolean first = true;

    sb.append("periodDuration:");
    sb.append(this.periodDuration);
    first = false;
    if (!first) sb.append(", ");
    sb.append("poolsCount:");
    sb.append(this.poolsCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("transactionsCount:");
    sb.append(this.transactionsCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("balancePerCurrency:");
    if (this.balancePerCurrency == null) {
      sb.append("null");
    } else {
      sb.append(this.balancePerCurrency);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("smartContractsCount:");
    sb.append(this.smartContractsCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("transactionsSmartCount:");
    sb.append(this.transactionsSmartCount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class PeriodStatsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PeriodStatsStandardScheme getScheme() {
      return new PeriodStatsStandardScheme();
    }
  }

  private static class PeriodStatsStandardScheme extends org.apache.thrift.scheme.StandardScheme<PeriodStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PeriodStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERIOD_DURATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.periodDuration = iprot.readI64();
              struct.setPeriodDurationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // POOLS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.poolsCount = iprot.readI32();
              struct.setPoolsCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRANSACTIONS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.transactionsCount = iprot.readI32();
              struct.setTransactionsCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BALANCE_PER_CURRENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.balancePerCurrency = new java.util.HashMap<java.lang.Byte,CumulativeAmount>(2*_map8.size);
                byte _key9;
                CumulativeAmount _val10;
                for (int _i11 = 0; _i11 < _map8.size; ++_i11)
                {
                  _key9 = iprot.readByte();
                  _val10 = new CumulativeAmount();
                  _val10.read(iprot);
                  struct.balancePerCurrency.put(_key9, _val10);
                }
                iprot.readMapEnd();
              }
              struct.setBalancePerCurrencyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SMART_CONTRACTS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.smartContractsCount = iprot.readI32();
              struct.setSmartContractsCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TRANSACTIONS_SMART_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.transactionsSmartCount = iprot.readI32();
              struct.setTransactionsSmartCountIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PeriodStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PERIOD_DURATION_FIELD_DESC);
      oprot.writeI64(struct.periodDuration);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(POOLS_COUNT_FIELD_DESC);
      oprot.writeI32(struct.poolsCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TRANSACTIONS_COUNT_FIELD_DESC);
      oprot.writeI32(struct.transactionsCount);
      oprot.writeFieldEnd();
      if (struct.balancePerCurrency != null) {
        oprot.writeFieldBegin(BALANCE_PER_CURRENCY_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.BYTE, org.apache.thrift.protocol.TType.STRUCT, struct.balancePerCurrency.size()));
          for (java.util.Map.Entry<java.lang.Byte, CumulativeAmount> _iter12 : struct.balancePerCurrency.entrySet())
          {
            oprot.writeByte(_iter12.getKey());
            _iter12.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SMART_CONTRACTS_COUNT_FIELD_DESC);
      oprot.writeI32(struct.smartContractsCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TRANSACTIONS_SMART_COUNT_FIELD_DESC);
      oprot.writeI32(struct.transactionsSmartCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PeriodStatsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PeriodStatsTupleScheme getScheme() {
      return new PeriodStatsTupleScheme();
    }
  }

  private static class PeriodStatsTupleScheme extends org.apache.thrift.scheme.TupleScheme<PeriodStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PeriodStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPeriodDuration()) {
        optionals.set(0);
      }
      if (struct.isSetPoolsCount()) {
        optionals.set(1);
      }
      if (struct.isSetTransactionsCount()) {
        optionals.set(2);
      }
      if (struct.isSetBalancePerCurrency()) {
        optionals.set(3);
      }
      if (struct.isSetSmartContractsCount()) {
        optionals.set(4);
      }
      if (struct.isSetTransactionsSmartCount()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetPeriodDuration()) {
        oprot.writeI64(struct.periodDuration);
      }
      if (struct.isSetPoolsCount()) {
        oprot.writeI32(struct.poolsCount);
      }
      if (struct.isSetTransactionsCount()) {
        oprot.writeI32(struct.transactionsCount);
      }
      if (struct.isSetBalancePerCurrency()) {
        {
          oprot.writeI32(struct.balancePerCurrency.size());
          for (java.util.Map.Entry<java.lang.Byte, CumulativeAmount> _iter13 : struct.balancePerCurrency.entrySet())
          {
            oprot.writeByte(_iter13.getKey());
            _iter13.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetSmartContractsCount()) {
        oprot.writeI32(struct.smartContractsCount);
      }
      if (struct.isSetTransactionsSmartCount()) {
        oprot.writeI32(struct.transactionsSmartCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PeriodStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.periodDuration = iprot.readI64();
        struct.setPeriodDurationIsSet(true);
      }
      if (incoming.get(1)) {
        struct.poolsCount = iprot.readI32();
        struct.setPoolsCountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.transactionsCount = iprot.readI32();
        struct.setTransactionsCountIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.BYTE, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.balancePerCurrency = new java.util.HashMap<java.lang.Byte,CumulativeAmount>(2*_map14.size);
          byte _key15;
          CumulativeAmount _val16;
          for (int _i17 = 0; _i17 < _map14.size; ++_i17)
          {
            _key15 = iprot.readByte();
            _val16 = new CumulativeAmount();
            _val16.read(iprot);
            struct.balancePerCurrency.put(_key15, _val16);
          }
        }
        struct.setBalancePerCurrencyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.smartContractsCount = iprot.readI32();
        struct.setSmartContractsCountIsSet(true);
      }
      if (incoming.get(5)) {
        struct.transactionsSmartCount = iprot.readI32();
        struct.setTransactionsSmartCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

