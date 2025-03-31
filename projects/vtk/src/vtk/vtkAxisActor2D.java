// java wrapper for vtkAxisActor2D object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkAxisActor2D extends vtkActor2D
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

  private native long GetPoint1Coordinate_4();
  public vtkCoordinate GetPoint1Coordinate()
  {
    long temp = GetPoint1Coordinate_4();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPoint1_5(double id0[]);
  public void SetPoint1(double id0[])
  {
    SetPoint1_5(id0);
  }

  private native void SetPoint1_6(double id0,double id1);
  public void SetPoint1(double id0,double id1)
  {
    SetPoint1_6(id0,id1);
  }

  private native long GetPoint2Coordinate_7();
  public vtkCoordinate GetPoint2Coordinate()
  {
    long temp = GetPoint2Coordinate_7();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPoint2_8(double id0[]);
  public void SetPoint2(double id0[])
  {
    SetPoint2_8(id0);
  }

  private native void SetPoint2_9(double id0,double id1);
  public void SetPoint2(double id0,double id1)
  {
    SetPoint2_9(id0,id1);
  }

  private native void SetRange_10(double id0,double id1);
  public void SetRange(double id0,double id1)
  {
    SetRange_10(id0,id1);
  }

  private native void SetRange_11(double id0[]);
  public void SetRange(double id0[])
  {
    SetRange_11(id0);
  }

  private native double[] GetRange_12();
  public double[] GetRange()
  {
    return GetRange_12();
  }

  private native void SetRulerMode_13(int id0);
  public void SetRulerMode(int id0)
  {
    SetRulerMode_13(id0);
  }

  private native int GetRulerMode_14();
  public int GetRulerMode()
  {
    return GetRulerMode_14();
  }

  private native void RulerModeOn_15();
  public void RulerModeOn()
  {
    RulerModeOn_15();
  }

  private native void RulerModeOff_16();
  public void RulerModeOff()
  {
    RulerModeOff_16();
  }

  private native void SetRulerDistance_17(double id0);
  public void SetRulerDistance(double id0)
  {
    SetRulerDistance_17(id0);
  }

  private native double GetRulerDistanceMinValue_18();
  public double GetRulerDistanceMinValue()
  {
    return GetRulerDistanceMinValue_18();
  }

  private native double GetRulerDistanceMaxValue_19();
  public double GetRulerDistanceMaxValue()
  {
    return GetRulerDistanceMaxValue_19();
  }

  private native double GetRulerDistance_20();
  public double GetRulerDistance()
  {
    return GetRulerDistance_20();
  }

  private native void SetNumberOfLabels_21(int id0);
  public void SetNumberOfLabels(int id0)
  {
    SetNumberOfLabels_21(id0);
  }

  private native int GetNumberOfLabelsMinValue_22();
  public int GetNumberOfLabelsMinValue()
  {
    return GetNumberOfLabelsMinValue_22();
  }

  private native int GetNumberOfLabelsMaxValue_23();
  public int GetNumberOfLabelsMaxValue()
  {
    return GetNumberOfLabelsMaxValue_23();
  }

  private native int GetNumberOfLabels_24();
  public int GetNumberOfLabels()
  {
    return GetNumberOfLabels_24();
  }

  private native void SetLabelFormat_25(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_25(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_26();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_26(), StandardCharsets.UTF_8);
  }

  private native void SetAdjustLabels_27(int id0);
  public void SetAdjustLabels(int id0)
  {
    SetAdjustLabels_27(id0);
  }

  private native int GetAdjustLabels_28();
  public int GetAdjustLabels()
  {
    return GetAdjustLabels_28();
  }

  private native void AdjustLabelsOn_29();
  public void AdjustLabelsOn()
  {
    AdjustLabelsOn_29();
  }

  private native void AdjustLabelsOff_30();
  public void AdjustLabelsOff()
  {
    AdjustLabelsOff_30();
  }

  private native void GetAdjustedRange_31(double id0[]);
  public void GetAdjustedRange(double id0[])
  {
    GetAdjustedRange_31(id0);
  }

  private native int GetAdjustedNumberOfLabels_32();
  public int GetAdjustedNumberOfLabels()
  {
    return GetAdjustedNumberOfLabels_32();
  }

  private native void SetTitle_33(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_33(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_34();
  public String GetTitle()
  {
    return new String(GetTitle_34(), StandardCharsets.UTF_8);
  }

  private native void SetTitleTextProperty_35(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_35(id0);
  }

  private native long GetTitleTextProperty_36();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_36();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelTextProperty_37(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_37(id0);
  }

  private native long GetLabelTextProperty_38();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_38();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTickLength_39(int id0);
  public void SetTickLength(int id0)
  {
    SetTickLength_39(id0);
  }

  private native int GetTickLengthMinValue_40();
  public int GetTickLengthMinValue()
  {
    return GetTickLengthMinValue_40();
  }

  private native int GetTickLengthMaxValue_41();
  public int GetTickLengthMaxValue()
  {
    return GetTickLengthMaxValue_41();
  }

  private native int GetTickLength_42();
  public int GetTickLength()
  {
    return GetTickLength_42();
  }

  private native void SetNumberOfMinorTicks_43(int id0);
  public void SetNumberOfMinorTicks(int id0)
  {
    SetNumberOfMinorTicks_43(id0);
  }

  private native int GetNumberOfMinorTicksMinValue_44();
  public int GetNumberOfMinorTicksMinValue()
  {
    return GetNumberOfMinorTicksMinValue_44();
  }

  private native int GetNumberOfMinorTicksMaxValue_45();
  public int GetNumberOfMinorTicksMaxValue()
  {
    return GetNumberOfMinorTicksMaxValue_45();
  }

  private native int GetNumberOfMinorTicks_46();
  public int GetNumberOfMinorTicks()
  {
    return GetNumberOfMinorTicks_46();
  }

  private native void SetMinorTickLength_47(int id0);
  public void SetMinorTickLength(int id0)
  {
    SetMinorTickLength_47(id0);
  }

  private native int GetMinorTickLengthMinValue_48();
  public int GetMinorTickLengthMinValue()
  {
    return GetMinorTickLengthMinValue_48();
  }

  private native int GetMinorTickLengthMaxValue_49();
  public int GetMinorTickLengthMaxValue()
  {
    return GetMinorTickLengthMaxValue_49();
  }

  private native int GetMinorTickLength_50();
  public int GetMinorTickLength()
  {
    return GetMinorTickLength_50();
  }

  private native void SetTickOffset_51(int id0);
  public void SetTickOffset(int id0)
  {
    SetTickOffset_51(id0);
  }

  private native int GetTickOffsetMinValue_52();
  public int GetTickOffsetMinValue()
  {
    return GetTickOffsetMinValue_52();
  }

  private native int GetTickOffsetMaxValue_53();
  public int GetTickOffsetMaxValue()
  {
    return GetTickOffsetMaxValue_53();
  }

  private native int GetTickOffset_54();
  public int GetTickOffset()
  {
    return GetTickOffset_54();
  }

  private native void SetAxisVisibility_55(int id0);
  public void SetAxisVisibility(int id0)
  {
    SetAxisVisibility_55(id0);
  }

  private native int GetAxisVisibility_56();
  public int GetAxisVisibility()
  {
    return GetAxisVisibility_56();
  }

  private native void AxisVisibilityOn_57();
  public void AxisVisibilityOn()
  {
    AxisVisibilityOn_57();
  }

  private native void AxisVisibilityOff_58();
  public void AxisVisibilityOff()
  {
    AxisVisibilityOff_58();
  }

  private native void SetTickVisibility_59(int id0);
  public void SetTickVisibility(int id0)
  {
    SetTickVisibility_59(id0);
  }

  private native int GetTickVisibility_60();
  public int GetTickVisibility()
  {
    return GetTickVisibility_60();
  }

  private native void TickVisibilityOn_61();
  public void TickVisibilityOn()
  {
    TickVisibilityOn_61();
  }

  private native void TickVisibilityOff_62();
  public void TickVisibilityOff()
  {
    TickVisibilityOff_62();
  }

  private native void SetLabelVisibility_63(int id0);
  public void SetLabelVisibility(int id0)
  {
    SetLabelVisibility_63(id0);
  }

  private native int GetLabelVisibility_64();
  public int GetLabelVisibility()
  {
    return GetLabelVisibility_64();
  }

  private native void LabelVisibilityOn_65();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_65();
  }

  private native void LabelVisibilityOff_66();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_66();
  }

  private native void SetTitleVisibility_67(int id0);
  public void SetTitleVisibility(int id0)
  {
    SetTitleVisibility_67(id0);
  }

  private native int GetTitleVisibility_68();
  public int GetTitleVisibility()
  {
    return GetTitleVisibility_68();
  }

  private native void TitleVisibilityOn_69();
  public void TitleVisibilityOn()
  {
    TitleVisibilityOn_69();
  }

  private native void TitleVisibilityOff_70();
  public void TitleVisibilityOff()
  {
    TitleVisibilityOff_70();
  }

  private native void SetTitlePosition_71(double id0);
  public void SetTitlePosition(double id0)
  {
    SetTitlePosition_71(id0);
  }

  private native double GetTitlePosition_72();
  public double GetTitlePosition()
  {
    return GetTitlePosition_72();
  }

  private native void SetFontFactor_73(double id0);
  public void SetFontFactor(double id0)
  {
    SetFontFactor_73(id0);
  }

  private native double GetFontFactorMinValue_74();
  public double GetFontFactorMinValue()
  {
    return GetFontFactorMinValue_74();
  }

  private native double GetFontFactorMaxValue_75();
  public double GetFontFactorMaxValue()
  {
    return GetFontFactorMaxValue_75();
  }

  private native double GetFontFactor_76();
  public double GetFontFactor()
  {
    return GetFontFactor_76();
  }

  private native void SetLabelFactor_77(double id0);
  public void SetLabelFactor(double id0)
  {
    SetLabelFactor_77(id0);
  }

  private native double GetLabelFactorMinValue_78();
  public double GetLabelFactorMinValue()
  {
    return GetLabelFactorMinValue_78();
  }

  private native double GetLabelFactorMaxValue_79();
  public double GetLabelFactorMaxValue()
  {
    return GetLabelFactorMaxValue_79();
  }

  private native double GetLabelFactor_80();
  public double GetLabelFactor()
  {
    return GetLabelFactor_80();
  }

  private native int RenderOverlay_81(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_81(id0);
  }

  private native int RenderOpaqueGeometry_82(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_82(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_83(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_83(id0);
  }

  private native int HasTranslucentPolygonalGeometry_84();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_84();
  }

  private native void ReleaseGraphicsResources_85(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_85(id0);
  }

  private native void SetSizeFontRelativeToAxis_86(int id0);
  public void SetSizeFontRelativeToAxis(int id0)
  {
    SetSizeFontRelativeToAxis_86(id0);
  }

  private native int GetSizeFontRelativeToAxis_87();
  public int GetSizeFontRelativeToAxis()
  {
    return GetSizeFontRelativeToAxis_87();
  }

  private native void SizeFontRelativeToAxisOn_88();
  public void SizeFontRelativeToAxisOn()
  {
    SizeFontRelativeToAxisOn_88();
  }

  private native void SizeFontRelativeToAxisOff_89();
  public void SizeFontRelativeToAxisOff()
  {
    SizeFontRelativeToAxisOff_89();
  }

  private native void SetUseFontSizeFromProperty_90(int id0);
  public void SetUseFontSizeFromProperty(int id0)
  {
    SetUseFontSizeFromProperty_90(id0);
  }

  private native int GetUseFontSizeFromProperty_91();
  public int GetUseFontSizeFromProperty()
  {
    return GetUseFontSizeFromProperty_91();
  }

  private native void UseFontSizeFromPropertyOn_92();
  public void UseFontSizeFromPropertyOn()
  {
    UseFontSizeFromPropertyOn_92();
  }

  private native void UseFontSizeFromPropertyOff_93();
  public void UseFontSizeFromPropertyOff()
  {
    UseFontSizeFromPropertyOff_93();
  }

  private native void ShallowCopy_94(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_94(id0);
  }

  public vtkAxisActor2D() { super(); }

  public vtkAxisActor2D(long id) { super(id); }
  public native long   VTKInit();

}
