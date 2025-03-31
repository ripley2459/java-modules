// java wrapper for vtkFinitePlaneRepresentation object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkFinitePlaneRepresentation extends vtkWidgetRepresentation
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

  private native void GetPolyData_4(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_4(id0);
  }

  private native long GetV1HandleProperty_5();
  public vtkProperty GetV1HandleProperty()
  {
    long temp = GetV1HandleProperty_5();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetV2HandleProperty_6();
  public vtkProperty GetV2HandleProperty()
  {
    long temp = GetV2HandleProperty_6();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedHandleProperty_7();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_7();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPlaneProperty_8();
  public vtkProperty GetPlaneProperty()
  {
    long temp = GetPlaneProperty_8();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedPlaneProperty_9();
  public vtkProperty GetSelectedPlaneProperty()
  {
    long temp = GetSelectedPlaneProperty_9();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTubing_10(boolean id0);
  public void SetTubing(boolean id0)
  {
    SetTubing_10(id0);
  }

  private native boolean GetTubing_11();
  public boolean GetTubing()
  {
    return GetTubing_11();
  }

  private native void TubingOn_12();
  public void TubingOn()
  {
    TubingOn_12();
  }

  private native void TubingOff_13();
  public void TubingOff()
  {
    TubingOff_13();
  }

  private native void SetDrawPlane_14(boolean id0);
  public void SetDrawPlane(boolean id0)
  {
    SetDrawPlane_14(id0);
  }

  private native boolean GetDrawPlane_15();
  public boolean GetDrawPlane()
  {
    return GetDrawPlane_15();
  }

  private native void DrawPlaneOn_16();
  public void DrawPlaneOn()
  {
    DrawPlaneOn_16();
  }

  private native void DrawPlaneOff_17();
  public void DrawPlaneOff()
  {
    DrawPlaneOff_17();
  }

  private native void SetHandles_18(boolean id0);
  public void SetHandles(boolean id0)
  {
    SetHandles_18(id0);
  }

  private native void HandlesOn_19();
  public void HandlesOn()
  {
    HandlesOn_19();
  }

  private native void HandlesOff_20();
  public void HandlesOff()
  {
    HandlesOff_20();
  }

  private native void PlaceWidget_21(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_21(id0);
  }

  private native void BuildRepresentation_22();
  public void BuildRepresentation()
  {
    BuildRepresentation_22();
  }

  private native int ComputeInteractionState_23(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_23(id0,id1,id2);
  }

  private native void StartWidgetInteraction_24(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_24(id0);
  }

  private native void WidgetInteraction_25(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_25(id0);
  }

  private native void ReleaseGraphicsResources_26(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_26(id0);
  }

  private native int RenderOpaqueGeometry_27(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_27(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_28(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_28(id0);
  }

  private native int HasTranslucentPolygonalGeometry_29();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_29();
  }

  private native void SetInteractionState_30(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_30(id0);
  }

  private native int GetInteractionStateMinValue_31();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_31();
  }

  private native int GetInteractionStateMaxValue_32();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_32();
  }

  private native void SetOrigin_33(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_33(id0,id1,id2);
  }

  private native void SetOrigin_34(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_34(id0);
  }

  private native double[] GetOrigin_35();
  public double[] GetOrigin()
  {
    return GetOrigin_35();
  }

  private native void SetNormal_36(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_36(id0,id1,id2);
  }

  private native void SetNormal_37(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_37(id0);
  }

  private native double[] GetNormal_38();
  public double[] GetNormal()
  {
    return GetNormal_38();
  }

  private native void SetV1_39(double id0,double id1);
  public void SetV1(double id0,double id1)
  {
    SetV1_39(id0,id1);
  }

  private native void SetV1_40(double id0[]);
  public void SetV1(double id0[])
  {
    SetV1_40(id0);
  }

  private native double[] GetV1_41();
  public double[] GetV1()
  {
    return GetV1_41();
  }

  private native void SetV2_42(double id0,double id1);
  public void SetV2(double id0,double id1)
  {
    SetV2_42(id0,id1);
  }

  private native void SetV2_43(double id0[]);
  public void SetV2(double id0[])
  {
    SetV2_43(id0);
  }

  private native double[] GetV2_44();
  public double[] GetV2()
  {
    return GetV2_44();
  }

  private native void SetRepresentationState_45(int id0);
  public void SetRepresentationState(int id0)
  {
    SetRepresentationState_45(id0);
  }

  private native int GetRepresentationState_46();
  public int GetRepresentationState()
  {
    return GetRepresentationState_46();
  }

  private native long GetNormalProperty_47();
  public vtkProperty GetNormalProperty()
  {
    long temp = GetNormalProperty_47();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedNormalProperty_48();
  public vtkProperty GetSelectedNormalProperty()
  {
    long temp = GetSelectedNormalProperty_48();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RegisterPickers_49();
  public void RegisterPickers()
  {
    RegisterPickers_49();
  }

  public vtkFinitePlaneRepresentation() { super(); }

  public vtkFinitePlaneRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
