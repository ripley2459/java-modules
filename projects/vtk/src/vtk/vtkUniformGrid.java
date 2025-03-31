// java wrapper for vtkUniformGrid object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkUniformGrid extends vtkImageData
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

  private native void CopyStructure_4(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_4(id0);
  }

  private native int GetDataObjectType_5();
  public int GetDataObjectType()
  {
    return GetDataObjectType_5();
  }

  private native long GetCell_6(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_6(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_7(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_7(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_8(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_8(id0,id1);
  }

  private native int GetCellType_9(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_9(id0);
  }

  private native void GetCellPoints_10(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_10(id0,id1);
  }

  private native void GetPointCells_11(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_11(id0,id1);
  }

  private native void Initialize_12();
  public void Initialize()
  {
    Initialize_12();
  }

  private native int GetMaxCellSize_13();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_13();
  }

  private native int GetGridDescription_14();
  public int GetGridDescription()
  {
    return GetGridDescription_14();
  }

  private native void BlankPoint_15(long id0);
  public void BlankPoint(long id0)
  {
    BlankPoint_15(id0);
  }

  private native void UnBlankPoint_16(long id0);
  public void UnBlankPoint(long id0)
  {
    UnBlankPoint_16(id0);
  }

  private native void BlankPoint_17(int id0,int id1,int id2);
  public void BlankPoint(int id0,int id1,int id2)
  {
    BlankPoint_17(id0,id1,id2);
  }

  private native void UnBlankPoint_18(int id0,int id1,int id2);
  public void UnBlankPoint(int id0,int id1,int id2)
  {
    UnBlankPoint_18(id0,id1,id2);
  }

  private native void BlankCell_19(long id0);
  public void BlankCell(long id0)
  {
    BlankCell_19(id0);
  }

  private native void UnBlankCell_20(long id0);
  public void UnBlankCell(long id0)
  {
    UnBlankCell_20(id0);
  }

  private native void BlankCell_21(int id0,int id1,int id2);
  public void BlankCell(int id0,int id1,int id2)
  {
    BlankCell_21(id0,id1,id2);
  }

  private native void UnBlankCell_22(int id0,int id1,int id2);
  public void UnBlankCell(int id0,int id1,int id2)
  {
    UnBlankCell_22(id0,id1,id2);
  }

  private native boolean HasAnyBlankCells_23();
  public boolean HasAnyBlankCells()
  {
    return HasAnyBlankCells_23();
  }

  private native boolean HasAnyBlankPoints_24();
  public boolean HasAnyBlankPoints()
  {
    return HasAnyBlankPoints_24();
  }

  private native byte IsPointVisible_25(long id0);
  public byte IsPointVisible(long id0)
  {
    return IsPointVisible_25(id0);
  }

  private native byte IsCellVisible_26(long id0);
  public byte IsCellVisible(long id0)
  {
    return IsCellVisible_26(id0);
  }

  private native long NewImageDataCopy_27();
  public vtkImageData NewImageDataCopy()
  {
    long temp = NewImageDataCopy_27();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_28(vtkInformation id0);
  public vtkUniformGrid GetData(vtkInformation id0)
  {
    long temp = GetData_28(id0);

    if (temp == 0) return null;
    return (vtkUniformGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_29(vtkInformationVector id0,int id1);
  public vtkUniformGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_29(id0,id1);

    if (temp == 0) return null;
    return (vtkUniformGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkUniformGrid() { super(); }

  public vtkUniformGrid(long id) { super(id); }
  public native long   VTKInit();

}
