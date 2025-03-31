// java wrapper for vtkUnstructuredGrid object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkUnstructuredGrid extends vtkUnstructuredGridBase
{

  private native long ExtendedNew_0();
  public vtkUnstructuredGrid ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsTypeOf_1(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_1(bytes0, bytes0.length);
  }

  private native int IsA_2(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_3(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_4(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_4(bytes0, bytes0.length);
  }

  private native int GetDataObjectType_5();
  public int GetDataObjectType()
  {
    return GetDataObjectType_5();
  }

  private native boolean AllocateEstimate_6(long id0,long id1);
  public boolean AllocateEstimate(long id0,long id1)
  {
    return AllocateEstimate_6(id0,id1);
  }

  private native boolean AllocateExact_7(long id0,long id1);
  public boolean AllocateExact(long id0,long id1)
  {
    return AllocateExact_7(id0,id1);
  }

  private native void Allocate_8(long id0,int id1);
  public void Allocate(long id0,int id1)
  {
    Allocate_8(id0,id1);
  }

  private native void Reset_9();
  public void Reset()
  {
    Reset_9();
  }

  private native void CopyStructure_10(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_10(id0);
  }

  private native long GetNumberOfCells_11();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_11();
  }

  private native long GetCell_12(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_12(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_13(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_13(id0,id1);
  }

  private native void GetCellBounds_14(long id0,double id1[]);
  public void GetCellBounds(long id0,double id1[])
  {
    GetCellBounds_14(id0,id1);
  }

  private native void GetCellPoints_15(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_15(id0,id1);
  }

  private native void GetPointCells_16(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_16(id0,id1);
  }

  private native long NewCellIterator_17();
  public vtkCellIterator NewCellIterator()
  {
    long temp = NewCellIterator_17();

    if (temp == 0) return null;
    return (vtkCellIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetCellType_18(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_18(id0);
  }

  private native long GetCellSize_19(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_19(id0);
  }

  private native void GetCellTypes_20(vtkCellTypes id0);
  public void GetCellTypes(vtkCellTypes id0)
  {
    GetCellTypes_20(id0);
  }

  private native long GetDistinctCellTypesArray_21();
  public vtkUnsignedCharArray GetDistinctCellTypesArray()
  {
    long temp = GetDistinctCellTypesArray_21();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellTypesArray_22();
  public vtkUnsignedCharArray GetCellTypesArray()
  {
    long temp = GetCellTypesArray_22();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Squeeze_23();
  public void Squeeze()
  {
    Squeeze_23();
  }

  private native void Initialize_24();
  public void Initialize()
  {
    Initialize_24();
  }

  private native int GetMaxCellSize_25();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_25();
  }

  private native int GetMaxSpatialDimension_26();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_26();
  }

  private native void BuildLinks_27();
  public void BuildLinks()
  {
    BuildLinks_27();
  }

  private native void SetLinks_28(vtkAbstractCellLinks id0);
  public void SetLinks(vtkAbstractCellLinks id0)
  {
    SetLinks_28(id0);
  }

  private native long GetLinks_29();
  public vtkAbstractCellLinks GetLinks()
  {
    long temp = GetLinks_29();

    if (temp == 0) return null;
    return (vtkAbstractCellLinks)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellLinks_30();
  public vtkAbstractCellLinks GetCellLinks()
  {
    long temp = GetCellLinks_30();

    if (temp == 0) return null;
    return (vtkAbstractCellLinks)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetFaceStream_31(long id0,vtkIdList id1);
  public void GetFaceStream(long id0,vtkIdList id1)
  {
    GetFaceStream_31(id0,id1);
  }

  private native void SetCells_32(int id0,vtkCellArray id1);
  public void SetCells(int id0,vtkCellArray id1)
  {
    SetCells_32(id0,id1);
  }

  private native void SetCells_33(vtkUnsignedCharArray id0,vtkCellArray id1);
  public void SetCells(vtkUnsignedCharArray id0,vtkCellArray id1)
  {
    SetCells_33(id0,id1);
  }

  private native void SetCells_34(vtkUnsignedCharArray id0,vtkCellArray id1,vtkIdTypeArray id2,vtkIdTypeArray id3);
  public void SetCells(vtkUnsignedCharArray id0,vtkCellArray id1,vtkIdTypeArray id2,vtkIdTypeArray id3)
  {
    SetCells_34(id0,id1,id2,id3);
  }

  private native long GetCells_35();
  public vtkCellArray GetCells()
  {
    long temp = GetCells_35();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCellNeighbors_36(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_36(id0,id1,id2);
  }

  private native void RemoveReferenceToCell_37(long id0,long id1);
  public void RemoveReferenceToCell(long id0,long id1)
  {
    RemoveReferenceToCell_37(id0,id1);
  }

  private native void AddReferenceToCell_38(long id0,long id1);
  public void AddReferenceToCell(long id0,long id1)
  {
    AddReferenceToCell_38(id0,id1);
  }

  private native void ResizeCellList_39(long id0,int id1);
  public void ResizeCellList(long id0,int id1)
  {
    ResizeCellList_39(id0,id1);
  }

  private native int GetPiece_40();
  public int GetPiece()
  {
    return GetPiece_40();
  }

  private native int GetNumberOfPieces_41();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_41();
  }

  private native int GetGhostLevel_42();
  public int GetGhostLevel()
  {
    return GetGhostLevel_42();
  }

  private native long GetActualMemorySize_43();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_43();
  }

  private native void ShallowCopy_44(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_44(id0);
  }

  private native void DeepCopy_45(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_45(id0);
  }

  private native void GetIdsOfCellsOfType_46(int id0,vtkIdTypeArray id1);
  public void GetIdsOfCellsOfType(int id0,vtkIdTypeArray id1)
  {
    GetIdsOfCellsOfType_46(id0,id1);
  }

  private native int IsHomogeneous_47();
  public int IsHomogeneous()
  {
    return IsHomogeneous_47();
  }

  private native void RemoveGhostCells_48();
  public void RemoveGhostCells()
  {
    RemoveGhostCells_48();
  }

  private native long GetData_49(vtkInformation id0);
  public vtkUnstructuredGrid GetData(vtkInformation id0)
  {
    long temp = GetData_49(id0);

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_50(vtkInformationVector id0,int id1);
  public vtkUnstructuredGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_50(id0,id1);

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaces_51();
  public vtkIdTypeArray GetFaces()
  {
    long temp = GetFaces_51();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceLocations_52();
  public vtkIdTypeArray GetFaceLocations()
  {
    long temp = GetFaceLocations_52();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int InitializeFacesRepresentation_53(long id0);
  public int InitializeFacesRepresentation(long id0)
  {
    return InitializeFacesRepresentation_53(id0);
  }

  private native long GetMeshMTime_54();
  public long GetMeshMTime()
  {
    return GetMeshMTime_54();
  }

  private native long GetCellLocationsArray_55();
  public vtkIdTypeArray GetCellLocationsArray()
  {
    long temp = GetCellLocationsArray_55();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCells_56(vtkUnsignedCharArray id0,vtkIdTypeArray id1,vtkCellArray id2);
  public void SetCells(vtkUnsignedCharArray id0,vtkIdTypeArray id1,vtkCellArray id2)
  {
    SetCells_56(id0,id1,id2);
  }

  private native void SetCells_57(vtkUnsignedCharArray id0,vtkIdTypeArray id1,vtkCellArray id2,vtkIdTypeArray id3,vtkIdTypeArray id4);
  public void SetCells(vtkUnsignedCharArray id0,vtkIdTypeArray id1,vtkCellArray id2,vtkIdTypeArray id3,vtkIdTypeArray id4)
  {
    SetCells_57(id0,id1,id2,id3,id4);
  }

  private native long GetCell_58(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_58(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkUnstructuredGrid() { super(); }

  public vtkUnstructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
