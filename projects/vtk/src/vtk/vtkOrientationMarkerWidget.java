// java wrapper for vtkOrientationMarkerWidget object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkOrientationMarkerWidget extends vtkInteractorObserver
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

  private native void SetOrientationMarker_4(vtkProp id0);
  public void SetOrientationMarker(vtkProp id0)
  {
    SetOrientationMarker_4(id0);
  }

  private native long GetOrientationMarker_5();
  public vtkProp GetOrientationMarker()
  {
    long temp = GetOrientationMarker_5();

    if (temp == 0) return null;
    return (vtkProp)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnabled_6(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_6(id0);
  }

  private native void SetInteractive_7(int id0);
  public void SetInteractive(int id0)
  {
    SetInteractive_7(id0);
  }

  private native int GetInteractive_8();
  public int GetInteractive()
  {
    return GetInteractive_8();
  }

  private native void InteractiveOn_9();
  public void InteractiveOn()
  {
    InteractiveOn_9();
  }

  private native void InteractiveOff_10();
  public void InteractiveOff()
  {
    InteractiveOff_10();
  }

  private native void SetOutlineColor_11(double id0,double id1,double id2);
  public void SetOutlineColor(double id0,double id1,double id2)
  {
    SetOutlineColor_11(id0,id1,id2);
  }

  private native double[] GetOutlineColor_12();
  public double[] GetOutlineColor()
  {
    return GetOutlineColor_12();
  }

  private native void SetViewport_13(double id0,double id1,double id2,double id3);
  public void SetViewport(double id0,double id1,double id2,double id3)
  {
    SetViewport_13(id0,id1,id2,id3);
  }

  private native void SetViewport_14(double id0[]);
  public void SetViewport(double id0[])
  {
    SetViewport_14(id0);
  }

  private native double[] GetViewport_15();
  public double[] GetViewport()
  {
    return GetViewport_15();
  }

  private native void SetTolerance_16(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_16(id0);
  }

  private native int GetToleranceMinValue_17();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_17();
  }

  private native int GetToleranceMaxValue_18();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_18();
  }

  private native int GetTolerance_19();
  public int GetTolerance()
  {
    return GetTolerance_19();
  }

  private native void SetZoom_20(double id0);
  public void SetZoom(double id0)
  {
    SetZoom_20(id0);
  }

  private native double GetZoomMinValue_21();
  public double GetZoomMinValue()
  {
    return GetZoomMinValue_21();
  }

  private native double GetZoomMaxValue_22();
  public double GetZoomMaxValue()
  {
    return GetZoomMaxValue_22();
  }

  private native double GetZoom_23();
  public double GetZoom()
  {
    return GetZoom_23();
  }

  private native void Modified_24();
  public void Modified()
  {
    Modified_24();
  }

  private native void EndInteraction_25();
  public void EndInteraction()
  {
    EndInteraction_25();
  }

  private native void SetShouldConstrainSize_26(int id0);
  public void SetShouldConstrainSize(int id0)
  {
    SetShouldConstrainSize_26(id0);
  }

  private native int GetShouldConstrainSize_27();
  public int GetShouldConstrainSize()
  {
    return GetShouldConstrainSize_27();
  }

  private native boolean SetSizeConstraintDimensionSizes_28(int id0,int id1);
  public boolean SetSizeConstraintDimensionSizes(int id0,int id1)
  {
    return SetSizeConstraintDimensionSizes_28(id0,id1);
  }

  private native int GetMinDimensionSize_29();
  public int GetMinDimensionSize()
  {
    return GetMinDimensionSize_29();
  }

  private native int GetMaxDimensionSize_30();
  public int GetMaxDimensionSize()
  {
    return GetMaxDimensionSize_30();
  }

  public vtkOrientationMarkerWidget() { super(); }

  public vtkOrientationMarkerWidget(long id) { super(id); }
  public native long   VTKInit();

}
