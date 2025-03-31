// java wrapper for vtkHigherOrderTriangle object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkHigherOrderTriangle extends vtkNonLinearCell
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

  private native int RequiresInitialization_6();
  public int RequiresInitialization()
  {
    return RequiresInitialization_6();
  }

  private native int GetNumberOfEdges_7();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_7();
  }

  private native int GetNumberOfFaces_8();
  public int GetNumberOfFaces()
  {
    return GetNumberOfFaces_8();
  }

  private native long GetEdge_9(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_9(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFace_10(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_10(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_11();
  public void Initialize()
  {
    Initialize_11();
  }

  private native int CellBoundary_12(int id0,double id1[],vtkIdList id2);
  public int CellBoundary(int id0,double id1[],vtkIdList id2)
  {
    return CellBoundary_12(id0,id1,id2);
  }

  private native void Contour_13(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10);
  public void Contour(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10)
  {
    Contour_13(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native void Clip_14(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9);
  public void Clip(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9)
  {
    Clip_14(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native int TriangulateLocalIds_15(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_15(id0,id1);
  }

  private native void SetParametricCoords_16();
  public void SetParametricCoords()
  {
    SetParametricCoords_16();
  }

  private native int GetParametricCenter_17(double id0[]);
  public int GetParametricCenter(double id0[])
  {
    return GetParametricCenter_17(id0);
  }

  private native double GetParametricDistance_18(double id0[]);
  public double GetParametricDistance(double id0[])
  {
    return GetParametricDistance_18(id0);
  }

  private native long GetOrder_19();
  public long GetOrder()
  {
    return GetOrder_19();
  }

  private native long ComputeOrder_20();
  public long ComputeOrder()
  {
    return ComputeOrder_20();
  }

  private native boolean PointCountSupportsUniformOrder_21(long id0);
  public boolean PointCountSupportsUniformOrder(long id0)
  {
    return PointCountSupportsUniformOrder_21(id0);
  }

  private native double Eta_22(long id0,long id1,double id2);
  public double Eta(long id0,long id1,double id2)
  {
    return Eta_22(id0,id1,id2);
  }

  private native double Deta_23(long id0,long id1,double id2);
  public double Deta(long id0,long id1,double id2)
  {
    return Deta_23(id0,id1,id2);
  }

  private native long GetEdgeCell_24();
  public vtkHigherOrderCurve GetEdgeCell()
  {
    long temp = GetEdgeCell_24();

    if (temp == 0) return null;
    return (vtkHigherOrderCurve)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkHigherOrderTriangle() { super(); }

  public vtkHigherOrderTriangle(long id) { super(id); }

}
