// java wrapper for vtkBezierHexahedron object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkBezierHexahedron extends vtkHigherOrderHexahedron
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

  private native long GetEdge_5(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_5(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFace_6(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_6(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRationalWeightsFromPointData_7(vtkPointData id0,long id1);
  public void SetRationalWeightsFromPointData(vtkPointData id0,long id1)
  {
    SetRationalWeightsFromPointData_7(id0,id1);
  }

  private native long GetRationalWeights_8();
  public vtkDoubleArray GetRationalWeights()
  {
    long temp = GetRationalWeights_8();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeCell_9();
  public vtkHigherOrderCurve GetEdgeCell()
  {
    long temp = GetEdgeCell_9();

    if (temp == 0) return null;
    return (vtkHigherOrderCurve)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceCell_10();
  public vtkHigherOrderQuadrilateral GetFaceCell()
  {
    long temp = GetFaceCell_10();

    if (temp == 0) return null;
    return (vtkHigherOrderQuadrilateral)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInterpolation_11();
  public vtkHigherOrderInterpolation GetInterpolation()
  {
    long temp = GetInterpolation_11();

    if (temp == 0) return null;
    return (vtkHigherOrderInterpolation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkBezierHexahedron() { super(); }

  public vtkBezierHexahedron(long id) { super(id); }
  public native long   VTKInit();

}
