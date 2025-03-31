// java wrapper for vtkRectilinearGrid object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkRectilinearGrid extends vtkDataSet
{

  private native long ExtendedNew_0();
  public vtkRectilinearGrid ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void CopyStructure_6(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_6(id0);
  }

  private native void Initialize_7();
  public void Initialize()
  {
    Initialize_7();
  }

  private native long GetNumberOfCells_8();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_8();
  }

  private native long GetNumberOfPoints_9();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_9();
  }

  private native double[] GetPoint_10(long id0);
  public double[] GetPoint(long id0)
  {
    return GetPoint_10(id0);
  }

  private native void GetPoint_11(long id0,double id1[]);
  public void GetPoint(long id0,double id1[])
  {
    GetPoint_11(id0,id1);
  }

  private native long GetCell_12(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_12(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_13(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_13(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_14(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_14(id0,id1);
  }

  private native void GetCellBounds_15(long id0,double id1[]);
  public void GetCellBounds(long id0,double id1[])
  {
    GetCellBounds_15(id0,id1);
  }

  private native long FindPoint_16(double id0,double id1,double id2);
  public long FindPoint(double id0,double id1,double id2)
  {
    return FindPoint_16(id0,id1,id2);
  }

  private native long FindPoint_17(double id0[]);
  public long FindPoint(double id0[])
  {
    return FindPoint_17(id0);
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

  private native void GetCellPoints_20(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_20(id0,id1);
  }

  private native void GetPointCells_21(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_21(id0,id1);
  }

  private native void ComputeBounds_22();
  public void ComputeBounds()
  {
    ComputeBounds_22();
  }

  private native int GetMaxCellSize_23();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_23();
  }

  private native int GetMaxSpatialDimension_24();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_24();
  }

  private native void GetCellNeighbors_25(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_25(id0,id1,id2);
  }

  private native byte IsPointVisible_26(long id0);
  public byte IsPointVisible(long id0)
  {
    return IsPointVisible_26(id0);
  }

  private native byte IsCellVisible_27(long id0);
  public byte IsCellVisible(long id0)
  {
    return IsCellVisible_27(id0);
  }

  private native boolean HasAnyBlankPoints_28();
  public boolean HasAnyBlankPoints()
  {
    return HasAnyBlankPoints_28();
  }

  private native boolean HasAnyBlankCells_29();
  public boolean HasAnyBlankCells()
  {
    return HasAnyBlankCells_29();
  }

  private native void GetCellDims_30(int id0[]);
  public void GetCellDims(int id0[])
  {
    GetCellDims_30(id0);
  }

  private native void GetPoints_31(vtkPoints id0);
  public void GetPoints(vtkPoints id0)
  {
    GetPoints_31(id0);
  }

  private native void SetDimensions_32(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_32(id0,id1,id2);
  }

  private native void SetDimensions_33(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_33(id0);
  }

  private native int[] GetDimensions_34();
  public int[] GetDimensions()
  {
    return GetDimensions_34();
  }

  private native int GetDataDimension_35();
  public int GetDataDimension()
  {
    return GetDataDimension_35();
  }

  private native int ComputeStructuredCoordinates_36(double id0[],int id1[],double id2[]);
  public int ComputeStructuredCoordinates(double id0[],int id1[],double id2[])
  {
    return ComputeStructuredCoordinates_36(id0,id1,id2);
  }

  private native long ComputePointId_37(int id0[]);
  public long ComputePointId(int id0[])
  {
    return ComputePointId_37(id0);
  }

  private native long ComputeCellId_38(int id0[]);
  public long ComputeCellId(int id0[])
  {
    return ComputeCellId_38(id0);
  }

  private native void GetPoint_39(int id0,int id1,int id2,double id3[]);
  public void GetPoint(int id0,int id1,int id2,double id3[])
  {
    GetPoint_39(id0,id1,id2,id3);
  }

  private native void SetXCoordinates_40(vtkDataArray id0);
  public void SetXCoordinates(vtkDataArray id0)
  {
    SetXCoordinates_40(id0);
  }

  private native long GetXCoordinates_41();
  public vtkDataArray GetXCoordinates()
  {
    long temp = GetXCoordinates_41();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYCoordinates_42(vtkDataArray id0);
  public void SetYCoordinates(vtkDataArray id0)
  {
    SetYCoordinates_42(id0);
  }

  private native long GetYCoordinates_43();
  public vtkDataArray GetYCoordinates()
  {
    long temp = GetYCoordinates_43();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZCoordinates_44(vtkDataArray id0);
  public void SetZCoordinates(vtkDataArray id0)
  {
    SetZCoordinates_44(id0);
  }

  private native long GetZCoordinates_45();
  public vtkDataArray GetZCoordinates()
  {
    long temp = GetZCoordinates_45();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetExtent_46(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_46(id0);
  }

  private native void SetExtent_47(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_47(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetExtent_48();
  public int[] GetExtent()
  {
    return GetExtent_48();
  }

  private native long GetActualMemorySize_49();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_49();
  }

  private native void ShallowCopy_50(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_50(id0);
  }

  private native void DeepCopy_51(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_51(id0);
  }

  private native int GetExtentType_52();
  public int GetExtentType()
  {
    return GetExtentType_52();
  }

  private native long GetData_53(vtkInformation id0);
  public vtkRectilinearGrid GetData(vtkInformation id0)
  {
    long temp = GetData_53(id0);

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_54(vtkInformationVector id0,int id1);
  public vtkRectilinearGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_54(id0,id1);

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalarType_55(int id0,vtkInformation id1);
  public void SetScalarType(int id0,vtkInformation id1)
  {
    SetScalarType_55(id0,id1);
  }

  private native int GetScalarType_56(vtkInformation id0);
  public int GetScalarType(vtkInformation id0)
  {
    return GetScalarType_56(id0);
  }

  private native boolean HasScalarType_57(vtkInformation id0);
  public boolean HasScalarType(vtkInformation id0)
  {
    return HasScalarType_57(id0);
  }

  private native int GetScalarType_58();
  public int GetScalarType()
  {
    return GetScalarType_58();
  }

  private native byte[] GetScalarTypeAsString_59();
  public String GetScalarTypeAsString()
  {
    return new String(GetScalarTypeAsString_59(), StandardCharsets.UTF_8);
  }

  private native void SetNumberOfScalarComponents_60(int id0,vtkInformation id1);
  public void SetNumberOfScalarComponents(int id0,vtkInformation id1)
  {
    SetNumberOfScalarComponents_60(id0,id1);
  }

  private native int GetNumberOfScalarComponents_61(vtkInformation id0);
  public int GetNumberOfScalarComponents(vtkInformation id0)
  {
    return GetNumberOfScalarComponents_61(id0);
  }

  private native boolean HasNumberOfScalarComponents_62(vtkInformation id0);
  public boolean HasNumberOfScalarComponents(vtkInformation id0)
  {
    return HasNumberOfScalarComponents_62(id0);
  }

  private native int GetNumberOfScalarComponents_63();
  public int GetNumberOfScalarComponents()
  {
    return GetNumberOfScalarComponents_63();
  }

  public vtkRectilinearGrid() { super(); }

  public vtkRectilinearGrid(long id) { super(id); }
  public native long   VTKInit();

}
