// java wrapper for vtkPolyVertex object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkPolyVertex extends vtkCell
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

  private native int GetCellType_4();
  public int GetCellType()
  {
    return GetCellType_4();
  }

  private native int GetCellDimension_5();
  public int GetCellDimension()
  {
    return GetCellDimension_5();
  }

  private native int GetNumberOfEdges_6();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_6();
  }

  private native int GetNumberOfFaces_7();
  public int GetNumberOfFaces()
  {
    return GetNumberOfFaces_7();
  }

  private native long GetEdge_8(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_8(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFace_9(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_9(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CellBoundary_10(int id0,double id1[],vtkIdList id2);
  public int CellBoundary(int id0,double id1[],vtkIdList id2)
  {
    return CellBoundary_10(id0,id1,id2);
  }

  private native void Contour_11(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10);
  public void Contour(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10)
  {
    Contour_11(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native void Clip_12(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9);
  public void Clip(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9)
  {
    Clip_12(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native int TriangulateLocalIds_13(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_13(id0,id1);
  }

  private native int IsPrimaryCell_14();
  public int IsPrimaryCell()
  {
    return IsPrimaryCell_14();
  }

  private native int GetParametricCenter_15(double id0[]);
  public int GetParametricCenter(double id0[])
  {
    return GetParametricCenter_15(id0);
  }

  public vtkPolyVertex() { super(); }

  public vtkPolyVertex(long id) { super(id); }
  public native long   VTKInit();

}
