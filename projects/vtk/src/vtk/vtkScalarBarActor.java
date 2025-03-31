// java wrapper for vtkScalarBarActor object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkScalarBarActor extends vtkActor2D
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

  private native int RenderOpaqueGeometry_4(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_4(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_5(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_5(id0);
  }

  private native int RenderOverlay_6(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_6(id0);
  }

  private native int HasTranslucentPolygonalGeometry_7();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_7();
  }

  private native void ReleaseGraphicsResources_8(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_8(id0);
  }

  private native void GetScalarBarRect_9(int id0[],vtkViewport id1);
  public void GetScalarBarRect(int id0[],vtkViewport id1)
  {
    GetScalarBarRect_9(id0,id1);
  }

  private native void SetLookupTable_10(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_10(id0);
  }

  private native long GetLookupTable_11();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_11();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseOpacity_12(int id0);
  public void SetUseOpacity(int id0)
  {
    SetUseOpacity_12(id0);
  }

  private native int GetUseOpacity_13();
  public int GetUseOpacity()
  {
    return GetUseOpacity_13();
  }

  private native void UseOpacityOn_14();
  public void UseOpacityOn()
  {
    UseOpacityOn_14();
  }

  private native void UseOpacityOff_15();
  public void UseOpacityOff()
  {
    UseOpacityOff_15();
  }

  private native void SetMaximumNumberOfColors_16(int id0);
  public void SetMaximumNumberOfColors(int id0)
  {
    SetMaximumNumberOfColors_16(id0);
  }

  private native int GetMaximumNumberOfColorsMinValue_17();
  public int GetMaximumNumberOfColorsMinValue()
  {
    return GetMaximumNumberOfColorsMinValue_17();
  }

  private native int GetMaximumNumberOfColorsMaxValue_18();
  public int GetMaximumNumberOfColorsMaxValue()
  {
    return GetMaximumNumberOfColorsMaxValue_18();
  }

  private native int GetMaximumNumberOfColors_19();
  public int GetMaximumNumberOfColors()
  {
    return GetMaximumNumberOfColors_19();
  }

  private native void SetNumberOfLabels_20(int id0);
  public void SetNumberOfLabels(int id0)
  {
    SetNumberOfLabels_20(id0);
  }

  private native int GetNumberOfLabelsMinValue_21();
  public int GetNumberOfLabelsMinValue()
  {
    return GetNumberOfLabelsMinValue_21();
  }

  private native int GetNumberOfLabelsMaxValue_22();
  public int GetNumberOfLabelsMaxValue()
  {
    return GetNumberOfLabelsMaxValue_22();
  }

  private native int GetNumberOfLabels_23();
  public int GetNumberOfLabels()
  {
    return GetNumberOfLabels_23();
  }

  private native void SetCustomLabels_24(vtkDoubleArray id0);
  public void SetCustomLabels(vtkDoubleArray id0)
  {
    SetCustomLabels_24(id0);
  }

  private native long GetCustomLabels_25();
  public vtkDoubleArray GetCustomLabels()
  {
    long temp = GetCustomLabels_25();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetUseCustomLabels_26();
  public boolean GetUseCustomLabels()
  {
    return GetUseCustomLabels_26();
  }

  private native void SetUseCustomLabels_27(boolean id0);
  public void SetUseCustomLabels(boolean id0)
  {
    SetUseCustomLabels_27(id0);
  }

  private native void UseCustomLabelsOn_28();
  public void UseCustomLabelsOn()
  {
    UseCustomLabelsOn_28();
  }

  private native void UseCustomLabelsOff_29();
  public void UseCustomLabelsOff()
  {
    UseCustomLabelsOff_29();
  }

  private native void SetOrientation_30(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_30(id0);
  }

  private native int GetOrientationMinValue_31();
  public int GetOrientationMinValue()
  {
    return GetOrientationMinValue_31();
  }

  private native int GetOrientationMaxValue_32();
  public int GetOrientationMaxValue()
  {
    return GetOrientationMaxValue_32();
  }

  private native int GetOrientation_33();
  public int GetOrientation()
  {
    return GetOrientation_33();
  }

  private native void SetOrientationToHorizontal_34();
  public void SetOrientationToHorizontal()
  {
    SetOrientationToHorizontal_34();
  }

  private native void SetOrientationToVertical_35();
  public void SetOrientationToVertical()
  {
    SetOrientationToVertical_35();
  }

  private native boolean GetForceVerticalTitle_36();
  public boolean GetForceVerticalTitle()
  {
    return GetForceVerticalTitle_36();
  }

  private native void SetForceVerticalTitle_37(boolean id0);
  public void SetForceVerticalTitle(boolean id0)
  {
    SetForceVerticalTitle_37(id0);
  }

  private native void SetTitleTextProperty_38(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_38(id0);
  }

  private native long GetTitleTextProperty_39();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_39();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelTextProperty_40(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_40(id0);
  }

  private native long GetLabelTextProperty_41();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_41();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAnnotationTextProperty_42(vtkTextProperty id0);
  public void SetAnnotationTextProperty(vtkTextProperty id0)
  {
    SetAnnotationTextProperty_42(id0);
  }

  private native long GetAnnotationTextProperty_43();
  public vtkTextProperty GetAnnotationTextProperty()
  {
    long temp = GetAnnotationTextProperty_43();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelFormat_44(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_44(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_45();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_45(), StandardCharsets.UTF_8);
  }

  private native void SetTitle_46(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_46(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_47();
  public String GetTitle()
  {
    return new String(GetTitle_47(), StandardCharsets.UTF_8);
  }

  private native void SetComponentTitle_48(byte[] id0, int len0);
  public void SetComponentTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetComponentTitle_48(bytes0, bytes0.length);
  }

  private native byte[] GetComponentTitle_49();
  public String GetComponentTitle()
  {
    return new String(GetComponentTitle_49(), StandardCharsets.UTF_8);
  }

  private native void ShallowCopy_50(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_50(id0);
  }

  private native void SetTextureGridWidth_51(double id0);
  public void SetTextureGridWidth(double id0)
  {
    SetTextureGridWidth_51(id0);
  }

  private native double GetTextureGridWidth_52();
  public double GetTextureGridWidth()
  {
    return GetTextureGridWidth_52();
  }

  private native long GetTextureActor_53();
  public vtkTexturedActor2D GetTextureActor()
  {
    long temp = GetTextureActor_53();

    if (temp == 0) return null;
    return (vtkTexturedActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTextPosition_54(int id0);
  public void SetTextPosition(int id0)
  {
    SetTextPosition_54(id0);
  }

  private native int GetTextPositionMinValue_55();
  public int GetTextPositionMinValue()
  {
    return GetTextPositionMinValue_55();
  }

  private native int GetTextPositionMaxValue_56();
  public int GetTextPositionMaxValue()
  {
    return GetTextPositionMaxValue_56();
  }

  private native int GetTextPosition_57();
  public int GetTextPosition()
  {
    return GetTextPosition_57();
  }

  private native void SetTextPositionToPrecedeScalarBar_58();
  public void SetTextPositionToPrecedeScalarBar()
  {
    SetTextPositionToPrecedeScalarBar_58();
  }

  private native void SetTextPositionToSucceedScalarBar_59();
  public void SetTextPositionToSucceedScalarBar()
  {
    SetTextPositionToSucceedScalarBar_59();
  }

  private native void SetMaximumWidthInPixels_60(int id0);
  public void SetMaximumWidthInPixels(int id0)
  {
    SetMaximumWidthInPixels_60(id0);
  }

  private native int GetMaximumWidthInPixels_61();
  public int GetMaximumWidthInPixels()
  {
    return GetMaximumWidthInPixels_61();
  }

  private native void SetMaximumHeightInPixels_62(int id0);
  public void SetMaximumHeightInPixels(int id0)
  {
    SetMaximumHeightInPixels_62(id0);
  }

  private native int GetMaximumHeightInPixels_63();
  public int GetMaximumHeightInPixels()
  {
    return GetMaximumHeightInPixels_63();
  }

  private native void SetAnnotationLeaderPadding_64(double id0);
  public void SetAnnotationLeaderPadding(double id0)
  {
    SetAnnotationLeaderPadding_64(id0);
  }

  private native double GetAnnotationLeaderPadding_65();
  public double GetAnnotationLeaderPadding()
  {
    return GetAnnotationLeaderPadding_65();
  }

  private native void SetDrawAnnotations_66(int id0);
  public void SetDrawAnnotations(int id0)
  {
    SetDrawAnnotations_66(id0);
  }

  private native int GetDrawAnnotations_67();
  public int GetDrawAnnotations()
  {
    return GetDrawAnnotations_67();
  }

  private native void DrawAnnotationsOn_68();
  public void DrawAnnotationsOn()
  {
    DrawAnnotationsOn_68();
  }

  private native void DrawAnnotationsOff_69();
  public void DrawAnnotationsOff()
  {
    DrawAnnotationsOff_69();
  }

  private native void SetDrawNanAnnotation_70(int id0);
  public void SetDrawNanAnnotation(int id0)
  {
    SetDrawNanAnnotation_70(id0);
  }

  private native int GetDrawNanAnnotation_71();
  public int GetDrawNanAnnotation()
  {
    return GetDrawNanAnnotation_71();
  }

  private native void DrawNanAnnotationOn_72();
  public void DrawNanAnnotationOn()
  {
    DrawNanAnnotationOn_72();
  }

  private native void DrawNanAnnotationOff_73();
  public void DrawNanAnnotationOff()
  {
    DrawNanAnnotationOff_73();
  }

  private native void SetDrawBelowRangeSwatch_74(boolean id0);
  public void SetDrawBelowRangeSwatch(boolean id0)
  {
    SetDrawBelowRangeSwatch_74(id0);
  }

  private native boolean GetDrawBelowRangeSwatch_75();
  public boolean GetDrawBelowRangeSwatch()
  {
    return GetDrawBelowRangeSwatch_75();
  }

  private native void DrawBelowRangeSwatchOn_76();
  public void DrawBelowRangeSwatchOn()
  {
    DrawBelowRangeSwatchOn_76();
  }

  private native void DrawBelowRangeSwatchOff_77();
  public void DrawBelowRangeSwatchOff()
  {
    DrawBelowRangeSwatchOff_77();
  }

  private native void SetBelowRangeAnnotation_78(byte[] id0, int len0);
  public void SetBelowRangeAnnotation(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBelowRangeAnnotation_78(bytes0, bytes0.length);
  }

  private native byte[] GetBelowRangeAnnotation_79();
  public String GetBelowRangeAnnotation()
  {
    return new String(GetBelowRangeAnnotation_79(), StandardCharsets.UTF_8);
  }

  private native void SetDrawAboveRangeSwatch_80(boolean id0);
  public void SetDrawAboveRangeSwatch(boolean id0)
  {
    SetDrawAboveRangeSwatch_80(id0);
  }

  private native boolean GetDrawAboveRangeSwatch_81();
  public boolean GetDrawAboveRangeSwatch()
  {
    return GetDrawAboveRangeSwatch_81();
  }

  private native void DrawAboveRangeSwatchOn_82();
  public void DrawAboveRangeSwatchOn()
  {
    DrawAboveRangeSwatchOn_82();
  }

  private native void DrawAboveRangeSwatchOff_83();
  public void DrawAboveRangeSwatchOff()
  {
    DrawAboveRangeSwatchOff_83();
  }

  private native void SetAboveRangeAnnotation_84(byte[] id0, int len0);
  public void SetAboveRangeAnnotation(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAboveRangeAnnotation_84(bytes0, bytes0.length);
  }

  private native byte[] GetAboveRangeAnnotation_85();
  public String GetAboveRangeAnnotation()
  {
    return new String(GetAboveRangeAnnotation_85(), StandardCharsets.UTF_8);
  }

  private native void SetFixedAnnotationLeaderLineColor_86(int id0);
  public void SetFixedAnnotationLeaderLineColor(int id0)
  {
    SetFixedAnnotationLeaderLineColor_86(id0);
  }

  private native int GetFixedAnnotationLeaderLineColor_87();
  public int GetFixedAnnotationLeaderLineColor()
  {
    return GetFixedAnnotationLeaderLineColor_87();
  }

  private native void FixedAnnotationLeaderLineColorOn_88();
  public void FixedAnnotationLeaderLineColorOn()
  {
    FixedAnnotationLeaderLineColorOn_88();
  }

  private native void FixedAnnotationLeaderLineColorOff_89();
  public void FixedAnnotationLeaderLineColorOff()
  {
    FixedAnnotationLeaderLineColorOff_89();
  }

  private native void SetNanAnnotation_90(byte[] id0, int len0);
  public void SetNanAnnotation(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNanAnnotation_90(bytes0, bytes0.length);
  }

  private native byte[] GetNanAnnotation_91();
  public String GetNanAnnotation()
  {
    return new String(GetNanAnnotation_91(), StandardCharsets.UTF_8);
  }

  private native void SetAnnotationTextScaling_92(int id0);
  public void SetAnnotationTextScaling(int id0)
  {
    SetAnnotationTextScaling_92(id0);
  }

  private native int GetAnnotationTextScaling_93();
  public int GetAnnotationTextScaling()
  {
    return GetAnnotationTextScaling_93();
  }

  private native void AnnotationTextScalingOn_94();
  public void AnnotationTextScalingOn()
  {
    AnnotationTextScalingOn_94();
  }

  private native void AnnotationTextScalingOff_95();
  public void AnnotationTextScalingOff()
  {
    AnnotationTextScalingOff_95();
  }

  private native void SetDrawBackground_96(int id0);
  public void SetDrawBackground(int id0)
  {
    SetDrawBackground_96(id0);
  }

  private native int GetDrawBackground_97();
  public int GetDrawBackground()
  {
    return GetDrawBackground_97();
  }

  private native void DrawBackgroundOn_98();
  public void DrawBackgroundOn()
  {
    DrawBackgroundOn_98();
  }

  private native void DrawBackgroundOff_99();
  public void DrawBackgroundOff()
  {
    DrawBackgroundOff_99();
  }

  private native void SetDrawFrame_100(int id0);
  public void SetDrawFrame(int id0)
  {
    SetDrawFrame_100(id0);
  }

  private native int GetDrawFrame_101();
  public int GetDrawFrame()
  {
    return GetDrawFrame_101();
  }

  private native void DrawFrameOn_102();
  public void DrawFrameOn()
  {
    DrawFrameOn_102();
  }

  private native void DrawFrameOff_103();
  public void DrawFrameOff()
  {
    DrawFrameOff_103();
  }

  private native void SetDrawColorBar_104(int id0);
  public void SetDrawColorBar(int id0)
  {
    SetDrawColorBar_104(id0);
  }

  private native int GetDrawColorBar_105();
  public int GetDrawColorBar()
  {
    return GetDrawColorBar_105();
  }

  private native void DrawColorBarOn_106();
  public void DrawColorBarOn()
  {
    DrawColorBarOn_106();
  }

  private native void DrawColorBarOff_107();
  public void DrawColorBarOff()
  {
    DrawColorBarOff_107();
  }

  private native void SetDrawTickLabels_108(int id0);
  public void SetDrawTickLabels(int id0)
  {
    SetDrawTickLabels_108(id0);
  }

  private native int GetDrawTickLabels_109();
  public int GetDrawTickLabels()
  {
    return GetDrawTickLabels_109();
  }

  private native void DrawTickLabelsOn_110();
  public void DrawTickLabelsOn()
  {
    DrawTickLabelsOn_110();
  }

  private native void DrawTickLabelsOff_111();
  public void DrawTickLabelsOff()
  {
    DrawTickLabelsOff_111();
  }

  private native void SetBackgroundProperty_112(vtkProperty2D id0);
  public void SetBackgroundProperty(vtkProperty2D id0)
  {
    SetBackgroundProperty_112(id0);
  }

  private native long GetBackgroundProperty_113();
  public vtkProperty2D GetBackgroundProperty()
  {
    long temp = GetBackgroundProperty_113();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFrameProperty_114(vtkProperty2D id0);
  public void SetFrameProperty(vtkProperty2D id0)
  {
    SetFrameProperty_114(id0);
  }

  private native long GetFrameProperty_115();
  public vtkProperty2D GetFrameProperty()
  {
    long temp = GetFrameProperty_115();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetTextPad_116();
  public int GetTextPad()
  {
    return GetTextPad_116();
  }

  private native void SetTextPad_117(int id0);
  public void SetTextPad(int id0)
  {
    SetTextPad_117(id0);
  }

  private native int GetVerticalTitleSeparation_118();
  public int GetVerticalTitleSeparation()
  {
    return GetVerticalTitleSeparation_118();
  }

  private native void SetVerticalTitleSeparation_119(int id0);
  public void SetVerticalTitleSeparation(int id0)
  {
    SetVerticalTitleSeparation_119(id0);
  }

  private native double GetBarRatio_120();
  public double GetBarRatio()
  {
    return GetBarRatio_120();
  }

  private native void SetBarRatio_121(double id0);
  public void SetBarRatio(double id0)
  {
    SetBarRatio_121(id0);
  }

  private native double GetBarRatioMinValue_122();
  public double GetBarRatioMinValue()
  {
    return GetBarRatioMinValue_122();
  }

  private native double GetBarRatioMaxValue_123();
  public double GetBarRatioMaxValue()
  {
    return GetBarRatioMaxValue_123();
  }

  private native double GetTitleRatio_124();
  public double GetTitleRatio()
  {
    return GetTitleRatio_124();
  }

  private native void SetTitleRatio_125(double id0);
  public void SetTitleRatio(double id0)
  {
    SetTitleRatio_125(id0);
  }

  private native double GetTitleRatioMinValue_126();
  public double GetTitleRatioMinValue()
  {
    return GetTitleRatioMinValue_126();
  }

  private native double GetTitleRatioMaxValue_127();
  public double GetTitleRatioMaxValue()
  {
    return GetTitleRatioMaxValue_127();
  }

  private native void SetUnconstrainedFontSize_128(boolean id0);
  public void SetUnconstrainedFontSize(boolean id0)
  {
    SetUnconstrainedFontSize_128(id0);
  }

  private native boolean GetUnconstrainedFontSize_129();
  public boolean GetUnconstrainedFontSize()
  {
    return GetUnconstrainedFontSize_129();
  }

  private native void UnconstrainedFontSizeOn_130();
  public void UnconstrainedFontSizeOn()
  {
    UnconstrainedFontSizeOn_130();
  }

  private native void UnconstrainedFontSizeOff_131();
  public void UnconstrainedFontSizeOff()
  {
    UnconstrainedFontSizeOff_131();
  }

  public vtkScalarBarActor() { super(); }

  public vtkScalarBarActor(long id) { super(id); }
  public native long   VTKInit();

}
