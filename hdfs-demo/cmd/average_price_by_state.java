// ORM class for table 'average_price_by_state'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jan 25 21:50:42 PST 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class average_price_by_state extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer year;
  public Integer get_year() {
    return year;
  }
  public void set_year(Integer year) {
    this.year = year;
  }
  public average_price_by_state with_year(Integer year) {
    this.year = year;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public average_price_by_state with_state(String state) {
    this.state = state;
    return this;
  }
  private String sector;
  public String get_sector() {
    return sector;
  }
  public void set_sector(String sector) {
    this.sector = sector;
  }
  public average_price_by_state with_sector(String sector) {
    this.sector = sector;
    return this;
  }
  private java.math.BigDecimal residential;
  public java.math.BigDecimal get_residential() {
    return residential;
  }
  public void set_residential(java.math.BigDecimal residential) {
    this.residential = residential;
  }
  public average_price_by_state with_residential(java.math.BigDecimal residential) {
    this.residential = residential;
    return this;
  }
  private java.math.BigDecimal commercial;
  public java.math.BigDecimal get_commercial() {
    return commercial;
  }
  public void set_commercial(java.math.BigDecimal commercial) {
    this.commercial = commercial;
  }
  public average_price_by_state with_commercial(java.math.BigDecimal commercial) {
    this.commercial = commercial;
    return this;
  }
  private java.math.BigDecimal industrial;
  public java.math.BigDecimal get_industrial() {
    return industrial;
  }
  public void set_industrial(java.math.BigDecimal industrial) {
    this.industrial = industrial;
  }
  public average_price_by_state with_industrial(java.math.BigDecimal industrial) {
    this.industrial = industrial;
    return this;
  }
  private java.math.BigDecimal transportation;
  public java.math.BigDecimal get_transportation() {
    return transportation;
  }
  public void set_transportation(java.math.BigDecimal transportation) {
    this.transportation = transportation;
  }
  public average_price_by_state with_transportation(java.math.BigDecimal transportation) {
    this.transportation = transportation;
    return this;
  }
  private java.math.BigDecimal other;
  public java.math.BigDecimal get_other() {
    return other;
  }
  public void set_other(java.math.BigDecimal other) {
    this.other = other;
  }
  public average_price_by_state with_other(java.math.BigDecimal other) {
    this.other = other;
    return this;
  }
  private java.math.BigDecimal total;
  public java.math.BigDecimal get_total() {
    return total;
  }
  public void set_total(java.math.BigDecimal total) {
    this.total = total;
  }
  public average_price_by_state with_total(java.math.BigDecimal total) {
    this.total = total;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof average_price_by_state)) {
      return false;
    }
    average_price_by_state that = (average_price_by_state) o;
    boolean equal = true;
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.sector == null ? that.sector == null : this.sector.equals(that.sector));
    equal = equal && (this.residential == null ? that.residential == null : this.residential.equals(that.residential));
    equal = equal && (this.commercial == null ? that.commercial == null : this.commercial.equals(that.commercial));
    equal = equal && (this.industrial == null ? that.industrial == null : this.industrial.equals(that.industrial));
    equal = equal && (this.transportation == null ? that.transportation == null : this.transportation.equals(that.transportation));
    equal = equal && (this.other == null ? that.other == null : this.other.equals(that.other));
    equal = equal && (this.total == null ? that.total == null : this.total.equals(that.total));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof average_price_by_state)) {
      return false;
    }
    average_price_by_state that = (average_price_by_state) o;
    boolean equal = true;
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.sector == null ? that.sector == null : this.sector.equals(that.sector));
    equal = equal && (this.residential == null ? that.residential == null : this.residential.equals(that.residential));
    equal = equal && (this.commercial == null ? that.commercial == null : this.commercial.equals(that.commercial));
    equal = equal && (this.industrial == null ? that.industrial == null : this.industrial.equals(that.industrial));
    equal = equal && (this.transportation == null ? that.transportation == null : this.transportation.equals(that.transportation));
    equal = equal && (this.other == null ? that.other == null : this.other.equals(that.other));
    equal = equal && (this.total == null ? that.total == null : this.total.equals(that.total));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.year = JdbcWritableBridge.readInteger(1, __dbResults);
    this.state = JdbcWritableBridge.readString(2, __dbResults);
    this.sector = JdbcWritableBridge.readString(3, __dbResults);
    this.residential = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.commercial = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.industrial = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.transportation = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.other = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.total = JdbcWritableBridge.readBigDecimal(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.year = JdbcWritableBridge.readInteger(1, __dbResults);
    this.state = JdbcWritableBridge.readString(2, __dbResults);
    this.sector = JdbcWritableBridge.readString(3, __dbResults);
    this.residential = JdbcWritableBridge.readBigDecimal(4, __dbResults);
    this.commercial = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.industrial = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.transportation = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.other = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.total = JdbcWritableBridge.readBigDecimal(9, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(year, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(state, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sector, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(residential, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(commercial, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(industrial, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(transportation, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(other, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(total, 9 + __off, 3, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(year, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(state, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sector, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(residential, 4 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(commercial, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(industrial, 6 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(transportation, 7 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(other, 8 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(total, 9 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.year = null;
    } else {
    this.year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sector = null;
    } else {
    this.sector = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.residential = null;
    } else {
    this.residential = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.commercial = null;
    } else {
    this.commercial = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.industrial = null;
    } else {
    this.industrial = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.transportation = null;
    } else {
    this.transportation = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.other = null;
    } else {
    this.other = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.total = null;
    } else {
    this.total = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.sector) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sector);
    }
    if (null == this.residential) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.residential, __dataOut);
    }
    if (null == this.commercial) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.commercial, __dataOut);
    }
    if (null == this.industrial) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.industrial, __dataOut);
    }
    if (null == this.transportation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.transportation, __dataOut);
    }
    if (null == this.other) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.other, __dataOut);
    }
    if (null == this.total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.total, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.sector) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sector);
    }
    if (null == this.residential) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.residential, __dataOut);
    }
    if (null == this.commercial) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.commercial, __dataOut);
    }
    if (null == this.industrial) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.industrial, __dataOut);
    }
    if (null == this.transportation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.transportation, __dataOut);
    }
    if (null == this.other) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.other, __dataOut);
    }
    if (null == this.total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.total, __dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sector==null?"null":sector, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(residential==null?"null":residential.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(commercial==null?"null":commercial.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(industrial==null?"null":industrial.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(transportation==null?"null":transportation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other==null?"null":other.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total==null?"null":total.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sector==null?"null":sector, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(residential==null?"null":residential.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(commercial==null?"null":commercial.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(industrial==null?"null":industrial.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(transportation==null?"null":transportation.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other==null?"null":other.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total==null?"null":total.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sector = null; } else {
      this.sector = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.residential = null; } else {
      this.residential = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.commercial = null; } else {
      this.commercial = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.industrial = null; } else {
      this.industrial = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.transportation = null; } else {
      this.transportation = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.other = null; } else {
      this.other = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total = null; } else {
      this.total = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sector = null; } else {
      this.sector = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.residential = null; } else {
      this.residential = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.commercial = null; } else {
      this.commercial = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.industrial = null; } else {
      this.industrial = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.transportation = null; } else {
      this.transportation = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.other = null; } else {
      this.other = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total = null; } else {
      this.total = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    average_price_by_state o = (average_price_by_state) super.clone();
    return o;
  }

  public void clone0(average_price_by_state o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("sector", this.sector);
    __sqoop$field_map.put("residential", this.residential);
    __sqoop$field_map.put("commercial", this.commercial);
    __sqoop$field_map.put("industrial", this.industrial);
    __sqoop$field_map.put("transportation", this.transportation);
    __sqoop$field_map.put("other", this.other);
    __sqoop$field_map.put("total", this.total);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("sector", this.sector);
    __sqoop$field_map.put("residential", this.residential);
    __sqoop$field_map.put("commercial", this.commercial);
    __sqoop$field_map.put("industrial", this.industrial);
    __sqoop$field_map.put("transportation", this.transportation);
    __sqoop$field_map.put("other", this.other);
    __sqoop$field_map.put("total", this.total);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("year".equals(__fieldName)) {
      this.year = (Integer) __fieldVal;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
    }
    else    if ("sector".equals(__fieldName)) {
      this.sector = (String) __fieldVal;
    }
    else    if ("residential".equals(__fieldName)) {
      this.residential = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("commercial".equals(__fieldName)) {
      this.commercial = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("industrial".equals(__fieldName)) {
      this.industrial = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("transportation".equals(__fieldName)) {
      this.transportation = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("other".equals(__fieldName)) {
      this.other = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("total".equals(__fieldName)) {
      this.total = (java.math.BigDecimal) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("year".equals(__fieldName)) {
      this.year = (Integer) __fieldVal;
      return true;
    }
    else    if ("state".equals(__fieldName)) {
      this.state = (String) __fieldVal;
      return true;
    }
    else    if ("sector".equals(__fieldName)) {
      this.sector = (String) __fieldVal;
      return true;
    }
    else    if ("residential".equals(__fieldName)) {
      this.residential = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("commercial".equals(__fieldName)) {
      this.commercial = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("industrial".equals(__fieldName)) {
      this.industrial = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("transportation".equals(__fieldName)) {
      this.transportation = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("other".equals(__fieldName)) {
      this.other = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("total".equals(__fieldName)) {
      this.total = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
