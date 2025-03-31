// java wrapper for vtkLegendScaleActor object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkLegendScaleActor extends vtkProp
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

  private native void SetLabelMode_4(int id0);
  public void SetLabelMode(int id0)
  {
    SetLabelMode_4(id0);
  }

  private native int GetLabelModeMinValue_5();
  public int GetLabelModeMinValue()
  {
    return GetLabelModeMinValue_5();
  }

  private native int GetLabelModeMaxValue_6();
  public int GetLabelModeMaxValue()
  {
    return GetLabelModeMaxValue_6();
  }

  private native int GetLabelMode_7();
  public int GetLabelMode()
  {
    return GetLabelMode_7();
  }

  private native void SetLabelModeToDistance_8();
  public void SetLabelModeToDistance()
  {
    SetLabelModeToDistance_8();
  }

  private native void SetLabelModeToXYCoordinates_9();
  public void SetLabelModeToXYCoordinates()
  {
    SetLabelModeToXYCoordinates_9();
  }

  private native void SetRightAxisVisibility_10(int id0);
  public void SetRightAxisVisibility(int id0)
  {
    SetRightAxisVisibility_10(id0);
  }

  private native int GetRightAxisVisibility_11();
  public int GetRightAxisVisibility()
  {
    return GetRightAxisVisibility_11();
  }

  private native void RightAxisVisibilityOn_12();
  public void RightAxisVisibilityOn()
  {
    RightAxisVisibilityOn_12();
  }

  private native void RightAxisVisibilityOff_13();
  public void RightAxisVisibilityOff()
  {
    RightAxisVisibilityOff_13();
  }

  private native void SetTopAxisVisibility_14(int id0);
  public void SetTopAxisVisibility(int id0)
  {
    SetTopAxisVisibility_14(id0);
  }

  private native int GetTopAxisVisibility_15();
  public int GetTopAxisVisibility()
  {
    return GetTopAxisVisibility_15();
  }

  private native void TopAxisVisibilityOn_16();
  public void TopAxisVisibilityOn()
  {
    TopAxisVisibilityOn_16();
  }

  private native void TopAxisVisibilityOff_17();
  public void TopAxisVisibilityOff()
  {
    TopAxisVisibilityOff_17();
  }

  private native void SetLeftAxisVisibility_18(int id0);
  public void SetLeftAxisVisibility(int id0)
  {
    SetLeftAxisVisibility_18(id0);
  }

  private native int GetLeftAxisVisibility_19();
  public int GetLeftAxisVisibility()
  {
    return GetLeftAxisVisibility_19();
  }

  private native void LeftAxisVisibilityOn_20();
  public void LeftAxisVisibilityOn()
  {
    LeftAxisVisibilityOn_20();
  }

  private native void LeftAxisVisibilityOff_21();
  public void LeftAxisVisibilityOff()
  {
    LeftAxisVisibilityOff_21();
  }

  private native void SetBottomAxisVisibility_22(int id0);
  public void SetBottomAxisVisibility(int id0)
  {
    SetBottomAxisVisibility_22(id0);
  }

  private native int GetBottomAxisVisibility_23();
  public int GetBottomAxisVisibility()
  {
    return GetBottomAxisVisibility_23();
  }

  private native void BottomAxisVisibilityOn_24();
  public void BottomAxisVisibilityOn()
  {
    BottomAxisVisibilityOn_24();
  }

  private native void BottomAxisVisibilityOff_25();
  public void BottomAxisVisibilityOff()
  {
    BottomAxisVisibilityOff_25();
  }

  private native void SetLegendVisibility_26(int id0);
  public void SetLegendVisibility(int id0)
  {
    SetLegendVisibility_26(id0);
  }

  private native int GetLegendVisibility_27();
  public int GetLegendVisibility()
  {
    return GetLegendVisibility_27();
  }

  private native void LegendVisibilityOn_28();
  public void LegendVisibilityOn()
  {
    LegendVisibilityOn_28();
  }

  private native void LegendVisibilityOff_29();
  public void LegendVisibilityOff()
  {
    LegendVisibilityOff_29();
  }

  private native void AllAxesOn_30();
  public void AllAxesOn()
  {
    AllAxesOn_30();
  }

  private native void AllAxesOff_31();
  public void AllAxesOff()
  {
    AllAxesOff_31();
  }

  private native void AllAnnotationsOn_32();
  public void AllAnnotationsOn()
  {
    AllAnnotationsOn_32();
  }

  private native void AllAnnotationsOff_33();
  public void AllAnnotationsOff()
  {
    AllAnnotationsOff_33();
  }

  private native void SetRightBorderOffset_34(int id0);
  public void SetRightBorderOffset(int id0)
  {
    SetRightBorderOffset_34(id0);
  }

  private native int GetRightBorderOffsetMinValue_35();
  public int GetRightBorderOffsetMinValue()
  {
    return GetRightBorderOffsetMinValue_35();
  }

  private native int GetRightBorderOffsetMaxValue_36();
  public int GetRightBorderOffsetMaxValue()
  {
    return GetRightBorderOffsetMaxValue_36();
  }

  private native int GetRightBorderOffset_37();
  public int GetRightBorderOffset()
  {
    return GetRightBorderOffset_37();
  }

  private native void SetTopBorderOffset_38(int id0);
  public void SetTopBorderOffset(int id0)
  {
    SetTopBorderOffset_38(id0);
  }

  private native int GetTopBorderOffsetMinValue_39();
  public int GetTopBorderOffsetMinValue()
  {
    return GetTopBorderOffsetMinValue_39();
  }

  private native int GetTopBorderOffsetMaxValue_40();
  public int GetTopBorderOffsetMaxValue()
  {
    return GetTopBorderOffsetMaxValue_40();
  }

  private native int GetTopBorderOffset_41();
  public int GetTopBorderOffset()
  {
    return GetTopBorderOffset_41();
  }

  private native void SetLeftBorderOffset_42(int id0);
  public void SetLeftBorderOffset(int id0)
  {
    SetLeftBorderOffset_42(id0);
  }

  private native int GetLeftBorderOffsetMinValue_43();
  public int GetLeftBorderOffsetMinValue()
  {
    return GetLeftBorderOffsetMinValue_43();
  }

  private native int GetLeftBorderOffsetMaxValue_44();
  public int GetLeftBorderOffsetMaxValue()
  {
    return GetLeftBorderOffsetMaxValue_44();
  }

  private native int GetLeftBorderOffset_45();
  public int GetLeftBorderOffset()
  {
    return GetLeftBorderOffset_45();
  }

  private native void SetBottomBorderOffset_46(int id0);
  public void SetBottomBorderOffset(int id0)
  {
    SetBottomBorderOffset_46(id0);
  }

  private native int GetBottomBorderOffsetMinValue_47();
  public int GetBottomBorderOffsetMinValue()
  {
    return GetBottomBorderOffsetMinValue_47();
  }

  private native int GetBottomBorderOffsetMaxValue_48();
  public int GetBottomBorderOffsetMaxValue()
  {
    return GetBottomBorderOffsetMaxValue_48();
  }

  private native int GetBottomBorderOffset_49();
  public int GetBottomBorderOffset()
  {
    return GetBottomBorderOffset_49();
  }

  private native void SetCornerOffsetFactor_50(double id0);
  public void SetCornerOffsetFactor(double id0)
  {
    SetCornerOffsetFactor_50(id0);
  }

  private native double GetCornerOffsetFactorMinValue_51();
  public double GetCornerOffsetFactorMinValue()
  {
    return GetCornerOffsetFactorMinValue_51();
  }

  private native double GetCornerOffsetFactorMaxValue_52();
  public double GetCornerOffsetFactorMaxValue()
  {
    return GetCornerOffsetFactorMaxValue_52();
  }

  private native double GetCornerOffsetFactor_53();
  public double GetCornerOffsetFactor()
  {
    return GetCornerOffsetFactor_53();
  }

  private native long GetLegendTitleProperty_54();
  public vtkTextProperty GetLegendTitleProperty()
  {
    long temp = GetLegendTitleProperty_54();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLegendLabelProperty_55();
  public vtkTextProperty GetLegendLabelProperty()
  {
    long temp = GetLegendLabelProperty_55();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxesTextProperty_56(vtkTextProperty id0);
  public void SetAxesTextProperty(vtkTextProperty id0)
  {
    SetAxesTextProperty_56(id0);
  }

  private native void SetUseFontSizeFromProperty_57(boolean id0);
  public void SetUseFontSizeFromProperty(boolean id0)
  {
    SetUseFontSizeFromProperty_57(id0);
  }

  private native void SetAdjustLabels_58(boolean id0);
  public void SetAdjustLabels(boolean id0)
  {
    SetAdjustLabels_58(id0);
  }

  private native long GetRightAxis_59();
  public vtkAxisActor2D GetRightAxis()
  {
    long temp = GetRightAxis_59();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTopAxis_60();
  public vtkAxisActor2D GetTopAxis()
  {
    long temp = GetTopAxis_60();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLeftAxis_61();
  public vtkAxisActor2D GetLeftAxis()
  {
    long temp = GetLeftAxis_61();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBottomAxis_62();
  public vtkAxisActor2D GetBottomAxis()
  {
    long temp = GetBottomAxis_62();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_63(vtkViewport id0);
  public void BuildRepresentation(vtkViewport id0)
  {
    BuildRepresentation_63(id0);
  }

  private native void GetActors2D_64(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_64(id0);
  }

  private native void ReleaseGraphicsResources_65(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_65(id0);
  }

  private native int RenderOverlay_66(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_66(id0);
  }

  private native int RenderOpaqueGeometry_67(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_67(id0);
  }

  public vtkLegendScaleActor() { super(); }

  public vtkLegendScaleActor(long id) { super(id); }
  public native long   VTKInit();

}
