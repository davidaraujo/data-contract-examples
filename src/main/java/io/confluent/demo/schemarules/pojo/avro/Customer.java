/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.demo.schemarules.pojo.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Customer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4010275608977394396L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customer\",\"namespace\":\"io.confluent.demo.schemarules.pojo.avro\",\"fields\":[{\"name\":\"ssn\",\"type\":\"string\",\"confluent:tags\":[\"PII\"]},{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"email\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"user_id\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"IBAN\",\"type\":\"string\",\"confluent:tags\":[\"PCI\"]},{\"name\":\"active\",\"type\":\"boolean\"},{\"name\":\"balance\",\"type\":\"float\"},{\"name\":\"acquisition_channel\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Customer> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Customer> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Customer> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Customer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Customer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Customer to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Customer from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Customer instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Customer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence ssn;
  private java.lang.CharSequence address;
  private java.lang.CharSequence email;
  private java.lang.CharSequence user_id;
  private int age;
  private java.lang.CharSequence IBAN;
  private boolean active;
  private float balance;
  private java.lang.CharSequence acquisition_channel;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Customer() {}

  /**
   * All-args constructor.
   * @param ssn The new value for ssn
   * @param address The new value for address
   * @param email The new value for email
   * @param user_id The new value for user_id
   * @param age The new value for age
   * @param IBAN The new value for IBAN
   * @param active The new value for active
   * @param balance The new value for balance
   * @param acquisition_channel The new value for acquisition_channel
   */
  public Customer(java.lang.CharSequence ssn, java.lang.CharSequence address, java.lang.CharSequence email, java.lang.CharSequence user_id, java.lang.Integer age, java.lang.CharSequence IBAN, java.lang.Boolean active, java.lang.Float balance, java.lang.CharSequence acquisition_channel) {
    this.ssn = ssn;
    this.address = address;
    this.email = email;
    this.user_id = user_id;
    this.age = age;
    this.IBAN = IBAN;
    this.active = active;
    this.balance = balance;
    this.acquisition_channel = acquisition_channel;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ssn;
    case 1: return address;
    case 2: return email;
    case 3: return user_id;
    case 4: return age;
    case 5: return IBAN;
    case 6: return active;
    case 7: return balance;
    case 8: return acquisition_channel;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ssn = (java.lang.CharSequence)value$; break;
    case 1: address = (java.lang.CharSequence)value$; break;
    case 2: email = (java.lang.CharSequence)value$; break;
    case 3: user_id = (java.lang.CharSequence)value$; break;
    case 4: age = (java.lang.Integer)value$; break;
    case 5: IBAN = (java.lang.CharSequence)value$; break;
    case 6: active = (java.lang.Boolean)value$; break;
    case 7: balance = (java.lang.Float)value$; break;
    case 8: acquisition_channel = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'ssn' field.
   * @return The value of the 'ssn' field.
   */
  public java.lang.CharSequence getSsn() {
    return ssn;
  }


  /**
   * Sets the value of the 'ssn' field.
   * @param value the value to set.
   */
  public void setSsn(java.lang.CharSequence value) {
    this.ssn = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }


  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }


  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'user_id' field.
   * @return The value of the 'user_id' field.
   */
  public java.lang.CharSequence getUserId() {
    return user_id;
  }


  /**
   * Sets the value of the 'user_id' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.CharSequence value) {
    this.user_id = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public int getAge() {
    return age;
  }


  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(int value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'IBAN' field.
   * @return The value of the 'IBAN' field.
   */
  public java.lang.CharSequence getIBAN() {
    return IBAN;
  }


  /**
   * Sets the value of the 'IBAN' field.
   * @param value the value to set.
   */
  public void setIBAN(java.lang.CharSequence value) {
    this.IBAN = value;
  }

  /**
   * Gets the value of the 'active' field.
   * @return The value of the 'active' field.
   */
  public boolean getActive() {
    return active;
  }


  /**
   * Sets the value of the 'active' field.
   * @param value the value to set.
   */
  public void setActive(boolean value) {
    this.active = value;
  }

  /**
   * Gets the value of the 'balance' field.
   * @return The value of the 'balance' field.
   */
  public float getBalance() {
    return balance;
  }


  /**
   * Sets the value of the 'balance' field.
   * @param value the value to set.
   */
  public void setBalance(float value) {
    this.balance = value;
  }

  /**
   * Gets the value of the 'acquisition_channel' field.
   * @return The value of the 'acquisition_channel' field.
   */
  public java.lang.CharSequence getAcquisitionChannel() {
    return acquisition_channel;
  }


  /**
   * Sets the value of the 'acquisition_channel' field.
   * @param value the value to set.
   */
  public void setAcquisitionChannel(java.lang.CharSequence value) {
    this.acquisition_channel = value;
  }

  /**
   * Creates a new Customer RecordBuilder.
   * @return A new Customer RecordBuilder
   */
  public static io.confluent.demo.schemarules.pojo.avro.Customer.Builder newBuilder() {
    return new io.confluent.demo.schemarules.pojo.avro.Customer.Builder();
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Customer RecordBuilder
   */
  public static io.confluent.demo.schemarules.pojo.avro.Customer.Builder newBuilder(io.confluent.demo.schemarules.pojo.avro.Customer.Builder other) {
    if (other == null) {
      return new io.confluent.demo.schemarules.pojo.avro.Customer.Builder();
    } else {
      return new io.confluent.demo.schemarules.pojo.avro.Customer.Builder(other);
    }
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Customer instance.
   * @param other The existing instance to copy.
   * @return A new Customer RecordBuilder
   */
  public static io.confluent.demo.schemarules.pojo.avro.Customer.Builder newBuilder(io.confluent.demo.schemarules.pojo.avro.Customer other) {
    if (other == null) {
      return new io.confluent.demo.schemarules.pojo.avro.Customer.Builder();
    } else {
      return new io.confluent.demo.schemarules.pojo.avro.Customer.Builder(other);
    }
  }

  /**
   * RecordBuilder for Customer instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customer>
    implements org.apache.avro.data.RecordBuilder<Customer> {

    private java.lang.CharSequence ssn;
    private java.lang.CharSequence address;
    private java.lang.CharSequence email;
    private java.lang.CharSequence user_id;
    private int age;
    private java.lang.CharSequence IBAN;
    private boolean active;
    private float balance;
    private java.lang.CharSequence acquisition_channel;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.demo.schemarules.pojo.avro.Customer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ssn)) {
        this.ssn = data().deepCopy(fields()[0].schema(), other.ssn);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.address)) {
        this.address = data().deepCopy(fields()[1].schema(), other.address);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.email)) {
        this.email = data().deepCopy(fields()[2].schema(), other.email);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.user_id)) {
        this.user_id = data().deepCopy(fields()[3].schema(), other.user_id);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.age)) {
        this.age = data().deepCopy(fields()[4].schema(), other.age);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.IBAN)) {
        this.IBAN = data().deepCopy(fields()[5].schema(), other.IBAN);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.active)) {
        this.active = data().deepCopy(fields()[6].schema(), other.active);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.balance)) {
        this.balance = data().deepCopy(fields()[7].schema(), other.balance);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.acquisition_channel)) {
        this.acquisition_channel = data().deepCopy(fields()[8].schema(), other.acquisition_channel);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing Customer instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.demo.schemarules.pojo.avro.Customer other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.ssn)) {
        this.ssn = data().deepCopy(fields()[0].schema(), other.ssn);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.address)) {
        this.address = data().deepCopy(fields()[1].schema(), other.address);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.email)) {
        this.email = data().deepCopy(fields()[2].schema(), other.email);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.user_id)) {
        this.user_id = data().deepCopy(fields()[3].schema(), other.user_id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.age)) {
        this.age = data().deepCopy(fields()[4].schema(), other.age);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.IBAN)) {
        this.IBAN = data().deepCopy(fields()[5].schema(), other.IBAN);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.active)) {
        this.active = data().deepCopy(fields()[6].schema(), other.active);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.balance)) {
        this.balance = data().deepCopy(fields()[7].schema(), other.balance);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.acquisition_channel)) {
        this.acquisition_channel = data().deepCopy(fields()[8].schema(), other.acquisition_channel);
        fieldSetFlags()[8] = true;
      }
    }

    /**
      * Gets the value of the 'ssn' field.
      * @return The value.
      */
    public java.lang.CharSequence getSsn() {
      return ssn;
    }


    /**
      * Sets the value of the 'ssn' field.
      * @param value The value of 'ssn'.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder setSsn(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ssn = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ssn' field has been set.
      * @return True if the 'ssn' field has been set, false otherwise.
      */
    public boolean hasSsn() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ssn' field.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder clearSsn() {
      ssn = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return address;
    }


    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.address = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder clearAddress() {
      address = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.CharSequence getEmail() {
      return email;
    }


    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.email = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder clearEmail() {
      email = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'user_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserId() {
      return user_id;
    }


    /**
      * Sets the value of the 'user_id' field.
      * @param value The value of 'user_id'.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder setUserId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.user_id = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'user_id' field has been set.
      * @return True if the 'user_id' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'user_id' field.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder clearUserId() {
      user_id = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public int getAge() {
      return age;
    }


    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder setAge(int value) {
      validate(fields()[4], value);
      this.age = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder clearAge() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'IBAN' field.
      * @return The value.
      */
    public java.lang.CharSequence getIBAN() {
      return IBAN;
    }


    /**
      * Sets the value of the 'IBAN' field.
      * @param value The value of 'IBAN'.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder setIBAN(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.IBAN = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'IBAN' field has been set.
      * @return True if the 'IBAN' field has been set, false otherwise.
      */
    public boolean hasIBAN() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'IBAN' field.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder clearIBAN() {
      IBAN = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'active' field.
      * @return The value.
      */
    public boolean getActive() {
      return active;
    }


    /**
      * Sets the value of the 'active' field.
      * @param value The value of 'active'.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder setActive(boolean value) {
      validate(fields()[6], value);
      this.active = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'active' field has been set.
      * @return True if the 'active' field has been set, false otherwise.
      */
    public boolean hasActive() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'active' field.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder clearActive() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'balance' field.
      * @return The value.
      */
    public float getBalance() {
      return balance;
    }


    /**
      * Sets the value of the 'balance' field.
      * @param value The value of 'balance'.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder setBalance(float value) {
      validate(fields()[7], value);
      this.balance = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'balance' field has been set.
      * @return True if the 'balance' field has been set, false otherwise.
      */
    public boolean hasBalance() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'balance' field.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder clearBalance() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'acquisition_channel' field.
      * @return The value.
      */
    public java.lang.CharSequence getAcquisitionChannel() {
      return acquisition_channel;
    }


    /**
      * Sets the value of the 'acquisition_channel' field.
      * @param value The value of 'acquisition_channel'.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder setAcquisitionChannel(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.acquisition_channel = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'acquisition_channel' field has been set.
      * @return True if the 'acquisition_channel' field has been set, false otherwise.
      */
    public boolean hasAcquisitionChannel() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'acquisition_channel' field.
      * @return This builder.
      */
    public io.confluent.demo.schemarules.pojo.avro.Customer.Builder clearAcquisitionChannel() {
      acquisition_channel = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Customer build() {
      try {
        Customer record = new Customer();
        record.ssn = fieldSetFlags()[0] ? this.ssn : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.address = fieldSetFlags()[1] ? this.address : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.email = fieldSetFlags()[2] ? this.email : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.user_id = fieldSetFlags()[3] ? this.user_id : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.age = fieldSetFlags()[4] ? this.age : (java.lang.Integer) defaultValue(fields()[4]);
        record.IBAN = fieldSetFlags()[5] ? this.IBAN : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.active = fieldSetFlags()[6] ? this.active : (java.lang.Boolean) defaultValue(fields()[6]);
        record.balance = fieldSetFlags()[7] ? this.balance : (java.lang.Float) defaultValue(fields()[7]);
        record.acquisition_channel = fieldSetFlags()[8] ? this.acquisition_channel : (java.lang.CharSequence) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Customer>
    WRITER$ = (org.apache.avro.io.DatumWriter<Customer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Customer>
    READER$ = (org.apache.avro.io.DatumReader<Customer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.ssn);

    out.writeString(this.address);

    if (this.email == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.email);
    }

    out.writeString(this.user_id);

    out.writeInt(this.age);

    out.writeString(this.IBAN);

    out.writeBoolean(this.active);

    out.writeFloat(this.balance);

    out.writeString(this.acquisition_channel);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.ssn = in.readString(this.ssn instanceof Utf8 ? (Utf8)this.ssn : null);

      this.address = in.readString(this.address instanceof Utf8 ? (Utf8)this.address : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.email = null;
      } else {
        this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
      }

      this.user_id = in.readString(this.user_id instanceof Utf8 ? (Utf8)this.user_id : null);

      this.age = in.readInt();

      this.IBAN = in.readString(this.IBAN instanceof Utf8 ? (Utf8)this.IBAN : null);

      this.active = in.readBoolean();

      this.balance = in.readFloat();

      this.acquisition_channel = in.readString(this.acquisition_channel instanceof Utf8 ? (Utf8)this.acquisition_channel : null);

    } else {
      for (int i = 0; i < 9; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.ssn = in.readString(this.ssn instanceof Utf8 ? (Utf8)this.ssn : null);
          break;

        case 1:
          this.address = in.readString(this.address instanceof Utf8 ? (Utf8)this.address : null);
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.email = null;
          } else {
            this.email = in.readString(this.email instanceof Utf8 ? (Utf8)this.email : null);
          }
          break;

        case 3:
          this.user_id = in.readString(this.user_id instanceof Utf8 ? (Utf8)this.user_id : null);
          break;

        case 4:
          this.age = in.readInt();
          break;

        case 5:
          this.IBAN = in.readString(this.IBAN instanceof Utf8 ? (Utf8)this.IBAN : null);
          break;

        case 6:
          this.active = in.readBoolean();
          break;

        case 7:
          this.balance = in.readFloat();
          break;

        case 8:
          this.acquisition_channel = in.readString(this.acquisition_channel instanceof Utf8 ? (Utf8)this.acquisition_channel : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









