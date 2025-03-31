// java wrapper for vtkCellGrid object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkCellGrid extends vtkDataObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native int GetDataObjectType_5();
  public int GetDataObjectType()
  {
    return GetDataObjectType_5();
  }

  private native long GetActualMemorySize_6();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_6();
  }

  private native void ShallowCopy_7(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_7(id0);
  }

  private native void DeepCopy_8(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_8(id0);
  }

  private native long GetAttributes_9(int id0);
  public vtkDataSetAttributes GetAttributes(int id0)
  {
    long temp = GetAttributes_9(id0);

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FindAttributes_10(int id0);
  public vtkDataSetAttributes FindAttributes(int id0)
  {
    long temp = FindAttributes_10(id0);

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGhostArray_11(int id0);
  public vtkUnsignedCharArray GetGhostArray(int id0)
  {
    long temp = GetGhostArray_11(id0);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SupportsGhostArray_12(int id0);
  public boolean SupportsGhostArray(int id0)
  {
    return SupportsGhostArray_12(id0);
  }

  private native int GetAttributeTypeForArray_13(vtkAbstractArray id0);
  public int GetAttributeTypeForArray(vtkAbstractArray id0)
  {
    return GetAttributeTypeForArray_13(id0);
  }

  private native long GetNumberOfElements_14(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_14(id0);
  }

  private native long GetNumberOfCells_15();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_15();
  }

  private native void GetBounds_16(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_16(id0);
  }

  private native long AddCellMetadata_17(vtkCellMetadata id0);
  public vtkCellMetadata AddCellMetadata(vtkCellMetadata id0)
  {
    long temp = AddCellMetadata_17(id0);

    if (temp == 0) return null;
    return (vtkCellMetadata)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int AddAllCellMetadata_18();
  public int AddAllCellMetadata()
  {
    return AddAllCellMetadata_18();
  }

  private native boolean RemoveCellMetadata_19(vtkCellMetadata id0);
  public boolean RemoveCellMetadata(vtkCellMetadata id0)
  {
    return RemoveCellMetadata_19(id0);
  }

  private native int RemoveUnusedCellMetadata_20();
  public int RemoveUnusedCellMetadata()
  {
    return RemoveUnusedCellMetadata_20();
  }

  private native boolean AddCellAttribute_21(vtkCellAttribute id0);
  public boolean AddCellAttribute(vtkCellAttribute id0)
  {
    return AddCellAttribute_21(id0);
  }

  private native boolean RemoveCellAttribute_22(vtkCellAttribute id0);
  public boolean RemoveCellAttribute(vtkCellAttribute id0)
  {
    return RemoveCellAttribute_22(id0);
  }

  private native boolean GetCellAttributeRange_23(vtkCellAttribute id0,int id1,double id2[],boolean id3);
  public boolean GetCellAttributeRange(vtkCellAttribute id0,int id1,double id2[],boolean id3)
  {
    return GetCellAttributeRange_23(id0,id1,id2,id3);
  }

  private native long GetCellAttributeById_24(int id0);
  public vtkCellAttribute GetCellAttributeById(int id0)
  {
    long temp = GetCellAttributeById_24(id0);

    if (temp == 0) return null;
    return (vtkCellAttribute)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellAttributeByName_25(byte[] id0, int len0);
  public vtkCellAttribute GetCellAttributeByName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetCellAttributeByName_25(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkCellAttribute)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetShapeAttribute_26();
  public vtkCellAttribute GetShapeAttribute()
  {
    long temp = GetShapeAttribute_26();

    if (temp == 0) return null;
    return (vtkCellAttribute)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SetShapeAttribute_27(vtkCellAttribute id0);
  public boolean SetShapeAttribute(vtkCellAttribute id0)
  {
    return SetShapeAttribute_27(id0);
  }

  private native boolean Query_28(vtkCellGridQuery id0);
  public boolean Query(vtkCellGridQuery id0)
  {
    return Query_28(id0);
  }

  private native int GetSchemaVersion_29();
  public int GetSchemaVersion()
  {
    return GetSchemaVersion_29();
  }

  private native void SetContentVersion_30(int id0);
  public void SetContentVersion(int id0)
  {
    SetContentVersion_30(id0);
  }

  private native int GetContentVersion_31();
  public int GetContentVersion()
  {
    return GetContentVersion_31();
  }

  private native long GetData_32(vtkInformation id0);
  public vtkCellGrid GetData(vtkInformation id0)
  {
    long temp = GetData_32(id0);

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_33(vtkInformationVector id0,int id1);
  public vtkCellGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_33(id0,id1);

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CorrespondingArray_34(vtkCellGrid id0,vtkDataArray id1,vtkCellGrid id2);
  public vtkDataArray CorrespondingArray(vtkCellGrid id0,vtkDataArray id1,vtkCellGrid id2)
  {
    long temp = CorrespondingArray_34(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCellGrid() { super(); }

  public vtkCellGrid(long id) { super(id); }
  public native long   VTKInit();

}
