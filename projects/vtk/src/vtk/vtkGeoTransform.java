// java wrapper for vtkGeoTransform object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkGeoTransform extends vtkAbstractTransform
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

  private native void SetSourceProjection_4(vtkGeoProjection id0);
  public void SetSourceProjection(vtkGeoProjection id0)
  {
    SetSourceProjection_4(id0);
  }

  private native long GetSourceProjection_5();
  public vtkGeoProjection GetSourceProjection()
  {
    long temp = GetSourceProjection_5();

    if (temp == 0) return null;
    return (vtkGeoProjection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDestinationProjection_6(vtkGeoProjection id0);
  public void SetDestinationProjection(vtkGeoProjection id0)
  {
    SetDestinationProjection_6(id0);
  }

  private native long GetDestinationProjection_7();
  public vtkGeoProjection GetDestinationProjection()
  {
    long temp = GetDestinationProjection_7();

    if (temp == 0) return null;
    return (vtkGeoProjection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void TransformPoints_8(vtkPoints id0,vtkPoints id1);
  public void TransformPoints(vtkPoints id0,vtkPoints id1)
  {
    TransformPoints_8(id0,id1);
  }

  private native void Inverse_9();
  public void Inverse()
  {
    Inverse_9();
  }

  private native void InternalTransformPoint_10(float id0[],float id1[]);
  public void InternalTransformPoint(float id0[],float id1[])
  {
    InternalTransformPoint_10(id0,id1);
  }

  private native void InternalTransformPoint_11(double id0[],double id1[]);
  public void InternalTransformPoint(double id0[],double id1[])
  {
    InternalTransformPoint_11(id0,id1);
  }

  private native int ComputeUTMZone_12(double id0,double id1);
  public int ComputeUTMZone(double id0,double id1)
  {
    return ComputeUTMZone_12(id0,id1);
  }

  private native long MakeTransform_13();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_13();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGeoTransform() { super(); }

  public vtkGeoTransform(long id) { super(id); }
  public native long   VTKInit();

}
