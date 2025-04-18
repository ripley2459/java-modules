// java wrapper for vtkLagrangeWedge object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkLagrangeWedge extends vtkHigherOrderWedge
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

  private native long GetBoundaryQuad_7();
  public vtkHigherOrderQuadrilateral GetBoundaryQuad()
  {
    long temp = GetBoundaryQuad_7();

    if (temp == 0) return null;
    return (vtkHigherOrderQuadrilateral)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBoundaryTri_8();
  public vtkHigherOrderTriangle GetBoundaryTri()
  {
    long temp = GetBoundaryTri_8();

    if (temp == 0) return null;
    return (vtkHigherOrderTriangle)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeCell_9();
  public vtkHigherOrderCurve GetEdgeCell()
  {
    long temp = GetEdgeCell_9();

    if (temp == 0) return null;
    return (vtkHigherOrderCurve)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInterpolation_10();
  public vtkHigherOrderInterpolation GetInterpolation()
  {
    long temp = GetInterpolation_10();

    if (temp == 0) return null;
    return (vtkHigherOrderInterpolation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkLagrangeWedge() { super(); }

  public vtkLagrangeWedge(long id) { super(id); }
  public native long   VTKInit();

}
