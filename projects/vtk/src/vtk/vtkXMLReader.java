// java wrapper for vtkXMLReader object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkXMLReader extends vtkAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetReadFromInputString_6(int id0);
  public void SetReadFromInputString(int id0)
  {
    SetReadFromInputString_6(id0);
  }

  private native int GetReadFromInputString_7();
  public int GetReadFromInputString()
  {
    return GetReadFromInputString_7();
  }

  private native void ReadFromInputStringOn_8();
  public void ReadFromInputStringOn()
  {
    ReadFromInputStringOn_8();
  }

  private native void ReadFromInputStringOff_9();
  public void ReadFromInputStringOff()
  {
    ReadFromInputStringOff_9();
  }

  private native void SetInputString_10(byte[] id0, int len0);
  public void SetInputString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputString_10(bytes0, bytes0.length);
  }

  private native int CanReadFile_11(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_11(bytes0, bytes0.length);
  }

  private native long GetOutputAsDataSet_12();
  public vtkDataSet GetOutputAsDataSet()
  {
    long temp = GetOutputAsDataSet_12();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutputAsDataSet_13(int id0);
  public vtkDataSet GetOutputAsDataSet(int id0)
  {
    long temp = GetOutputAsDataSet_13(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointDataArraySelection_14();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_14();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellDataArraySelection_15();
  public vtkDataArraySelection GetCellDataArraySelection()
  {
    long temp = GetCellDataArraySelection_15();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetColumnArraySelection_16();
  public vtkDataArraySelection GetColumnArraySelection()
  {
    long temp = GetColumnArraySelection_16();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPointArrays_17();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_17();
  }

  private native int GetNumberOfCellArrays_18();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_18();
  }

  private native int GetNumberOfColumnArrays_19();
  public int GetNumberOfColumnArrays()
  {
    return GetNumberOfColumnArrays_19();
  }

  private native int GetNumberOfTimeDataArrays_20();
  public int GetNumberOfTimeDataArrays()
  {
    return GetNumberOfTimeDataArrays_20();
  }

  private native byte[] GetTimeDataArray_21(int id0);
  public String GetTimeDataArray(int id0)
  {
    return new String(GetTimeDataArray_21(id0), StandardCharsets.UTF_8);
  }

  private native long GetTimeDataStringArray_22();
  public vtkStringArray GetTimeDataStringArray()
  {
    long temp = GetTimeDataStringArray_22();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetActiveTimeDataArrayName_23();
  public String GetActiveTimeDataArrayName()
  {
    return new String(GetActiveTimeDataArrayName_23(), StandardCharsets.UTF_8);
  }

  private native void SetActiveTimeDataArrayName_24(byte[] id0, int len0);
  public void SetActiveTimeDataArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetActiveTimeDataArrayName_24(bytes0, bytes0.length);
  }

  private native byte[] GetPointArrayName_25(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_25(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetCellArrayName_26(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_26(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetColumnArrayName_27(int id0);
  public String GetColumnArrayName(int id0)
  {
    return new String(GetColumnArrayName_27(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointArrayStatus_28(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_28(bytes0, bytes0.length);
  }

  private native int GetCellArrayStatus_29(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_29(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_30(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_30(bytes0, bytes0.length,id1);
  }

  private native void SetCellArrayStatus_31(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_31(bytes0, bytes0.length,id1);
  }

  private native int GetColumnArrayStatus_32(byte[] id0, int len0);
  public int GetColumnArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetColumnArrayStatus_32(bytes0, bytes0.length);
  }

  private native void SetColumnArrayStatus_33(byte[] id0, int len0,int id1);
  public void SetColumnArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColumnArrayStatus_33(bytes0, bytes0.length,id1);
  }

  private native void CopyOutputInformation_34(vtkInformation id0,int id1);
  public void CopyOutputInformation(vtkInformation id0,int id1)
  {
    CopyOutputInformation_34(id0,id1);
  }

  private native void SetTimeStep_35(int id0);
  public void SetTimeStep(int id0)
  {
    SetTimeStep_35(id0);
  }

  private native int GetTimeStep_36();
  public int GetTimeStep()
  {
    return GetTimeStep_36();
  }

  private native int GetNumberOfTimeSteps_37();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_37();
  }

  private native int[] GetTimeStepRange_38();
  public int[] GetTimeStepRange()
  {
    return GetTimeStepRange_38();
  }

  private native void SetTimeStepRange_39(int id0,int id1);
  public void SetTimeStepRange(int id0,int id1)
  {
    SetTimeStepRange_39(id0,id1);
  }

  private native void SetTimeStepRange_40(int id0[]);
  public void SetTimeStepRange(int id0[])
  {
    SetTimeStepRange_40(id0);
  }

  private native long GetXMLParser_41();
  public vtkXMLDataParser GetXMLParser()
  {
    long temp = GetXMLParser_41();

    if (temp == 0) return null;
    return (vtkXMLDataParser)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetReaderErrorObserver_42(vtkCommand id0);
  public void SetReaderErrorObserver(vtkCommand id0)
  {
    SetReaderErrorObserver_42(id0);
  }

  private native long GetReaderErrorObserver_43();
  public vtkCommand GetReaderErrorObserver()
  {
    long temp = GetReaderErrorObserver_43();

    if (temp == 0) return null;
    return (vtkCommand)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetParserErrorObserver_44(vtkCommand id0);
  public void SetParserErrorObserver(vtkCommand id0)
  {
    SetParserErrorObserver_44(id0);
  }

  private native long GetParserErrorObserver_45();
  public vtkCommand GetParserErrorObserver()
  {
    long temp = GetParserErrorObserver_45();

    if (temp == 0) return null;
    return (vtkCommand)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkXMLReader() { super(); }

  public vtkXMLReader(long id) { super(id); }

}
