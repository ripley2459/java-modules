// java wrapper for vtkXYPlotActor object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkXYPlotActor extends vtkActor2D
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

  private native void AddDataSetInput_4(vtkDataSet id0,byte[] id1, int len1,int id2);
  public void AddDataSetInput(vtkDataSet id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddDataSetInput_4(id0,bytes1, bytes1.length,id2);
  }

  private native void AddDataSetInput_5(vtkDataSet id0);
  public void AddDataSetInput(vtkDataSet id0)
  {
    AddDataSetInput_5(id0);
  }

  private native void AddDataSetInputConnection_6(vtkAlgorithmOutput id0,byte[] id1, int len1,int id2);
  public void AddDataSetInputConnection(vtkAlgorithmOutput id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddDataSetInputConnection_6(id0,bytes1, bytes1.length,id2);
  }

  private native void AddDataSetInputConnection_7(vtkAlgorithmOutput id0);
  public void AddDataSetInputConnection(vtkAlgorithmOutput id0)
  {
    AddDataSetInputConnection_7(id0);
  }

  private native void RemoveDataSetInput_8(vtkDataSet id0,byte[] id1, int len1,int id2);
  public void RemoveDataSetInput(vtkDataSet id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    RemoveDataSetInput_8(id0,bytes1, bytes1.length,id2);
  }

  private native void RemoveDataSetInput_9(vtkDataSet id0);
  public void RemoveDataSetInput(vtkDataSet id0)
  {
    RemoveDataSetInput_9(id0);
  }

  private native void RemoveDataSetInputConnection_10(vtkAlgorithmOutput id0,byte[] id1, int len1,int id2);
  public void RemoveDataSetInputConnection(vtkAlgorithmOutput id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    RemoveDataSetInputConnection_10(id0,bytes1, bytes1.length,id2);
  }

  private native void RemoveDataSetInputConnection_11(vtkAlgorithmOutput id0);
  public void RemoveDataSetInputConnection(vtkAlgorithmOutput id0)
  {
    RemoveDataSetInputConnection_11(id0);
  }

  private native void RemoveAllDataSetInputConnections_12();
  public void RemoveAllDataSetInputConnections()
  {
    RemoveAllDataSetInputConnections_12();
  }

  private native void SetPointComponent_13(int id0,int id1);
  public void SetPointComponent(int id0,int id1)
  {
    SetPointComponent_13(id0,id1);
  }

  private native int GetPointComponent_14(int id0);
  public int GetPointComponent(int id0)
  {
    return GetPointComponent_14(id0);
  }

  private native void SetXValues_15(int id0);
  public void SetXValues(int id0)
  {
    SetXValues_15(id0);
  }

  private native int GetXValuesMinValue_16();
  public int GetXValuesMinValue()
  {
    return GetXValuesMinValue_16();
  }

  private native int GetXValuesMaxValue_17();
  public int GetXValuesMaxValue()
  {
    return GetXValuesMaxValue_17();
  }

  private native int GetXValues_18();
  public int GetXValues()
  {
    return GetXValues_18();
  }

  private native void SetXValuesToIndex_19();
  public void SetXValuesToIndex()
  {
    SetXValuesToIndex_19();
  }

  private native void SetXValuesToArcLength_20();
  public void SetXValuesToArcLength()
  {
    SetXValuesToArcLength_20();
  }

  private native void SetXValuesToNormalizedArcLength_21();
  public void SetXValuesToNormalizedArcLength()
  {
    SetXValuesToNormalizedArcLength_21();
  }

  private native void SetXValuesToValue_22();
  public void SetXValuesToValue()
  {
    SetXValuesToValue_22();
  }

  private native byte[] GetXValuesAsString_23();
  public String GetXValuesAsString()
  {
    return new String(GetXValuesAsString_23(), StandardCharsets.UTF_8);
  }

  private native void AddDataObjectInput_24(vtkDataObject id0);
  public void AddDataObjectInput(vtkDataObject id0)
  {
    AddDataObjectInput_24(id0);
  }

  private native void AddDataObjectInputConnection_25(vtkAlgorithmOutput id0);
  public void AddDataObjectInputConnection(vtkAlgorithmOutput id0)
  {
    AddDataObjectInputConnection_25(id0);
  }

  private native void RemoveDataObjectInputConnection_26(vtkAlgorithmOutput id0);
  public void RemoveDataObjectInputConnection(vtkAlgorithmOutput id0)
  {
    RemoveDataObjectInputConnection_26(id0);
  }

  private native void RemoveDataObjectInput_27(vtkDataObject id0);
  public void RemoveDataObjectInput(vtkDataObject id0)
  {
    RemoveDataObjectInput_27(id0);
  }

  private native void SetDataObjectPlotMode_28(int id0);
  public void SetDataObjectPlotMode(int id0)
  {
    SetDataObjectPlotMode_28(id0);
  }

  private native int GetDataObjectPlotModeMinValue_29();
  public int GetDataObjectPlotModeMinValue()
  {
    return GetDataObjectPlotModeMinValue_29();
  }

  private native int GetDataObjectPlotModeMaxValue_30();
  public int GetDataObjectPlotModeMaxValue()
  {
    return GetDataObjectPlotModeMaxValue_30();
  }

  private native int GetDataObjectPlotMode_31();
  public int GetDataObjectPlotMode()
  {
    return GetDataObjectPlotMode_31();
  }

  private native void SetDataObjectPlotModeToRows_32();
  public void SetDataObjectPlotModeToRows()
  {
    SetDataObjectPlotModeToRows_32();
  }

  private native void SetDataObjectPlotModeToColumns_33();
  public void SetDataObjectPlotModeToColumns()
  {
    SetDataObjectPlotModeToColumns_33();
  }

  private native byte[] GetDataObjectPlotModeAsString_34();
  public String GetDataObjectPlotModeAsString()
  {
    return new String(GetDataObjectPlotModeAsString_34(), StandardCharsets.UTF_8);
  }

  private native void SetDataObjectXComponent_35(int id0,int id1);
  public void SetDataObjectXComponent(int id0,int id1)
  {
    SetDataObjectXComponent_35(id0,id1);
  }

  private native int GetDataObjectXComponent_36(int id0);
  public int GetDataObjectXComponent(int id0)
  {
    return GetDataObjectXComponent_36(id0);
  }

  private native void SetDataObjectYComponent_37(int id0,int id1);
  public void SetDataObjectYComponent(int id0,int id1)
  {
    SetDataObjectYComponent_37(id0,id1);
  }

  private native int GetDataObjectYComponent_38(int id0);
  public int GetDataObjectYComponent(int id0)
  {
    return GetDataObjectYComponent_38(id0);
  }

  private native void SetPlotColor_39(int id0,double id1,double id2,double id3);
  public void SetPlotColor(int id0,double id1,double id2,double id3)
  {
    SetPlotColor_39(id0,id1,id2,id3);
  }

  private native void SetPlotColor_40(int id0,double id1[]);
  public void SetPlotColor(int id0,double id1[])
  {
    SetPlotColor_40(id0,id1);
  }

  private native double[] GetPlotColor_41(int id0);
  public double[] GetPlotColor(int id0)
  {
    return GetPlotColor_41(id0);
  }

  private native void SetPlotSymbol_42(int id0,vtkPolyData id1);
  public void SetPlotSymbol(int id0,vtkPolyData id1)
  {
    SetPlotSymbol_42(id0,id1);
  }

  private native long GetPlotSymbol_43(int id0);
  public vtkPolyData GetPlotSymbol(int id0)
  {
    long temp = GetPlotSymbol_43(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPlotLabel_44(int id0,byte[] id1, int len1);
  public void SetPlotLabel(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetPlotLabel_44(id0,bytes1, bytes1.length);
  }

  private native byte[] GetPlotLabel_45(int id0);
  public String GetPlotLabel(int id0)
  {
    return new String(GetPlotLabel_45(id0), StandardCharsets.UTF_8);
  }

  private native int GetPlotCurvePoints_46();
  public int GetPlotCurvePoints()
  {
    return GetPlotCurvePoints_46();
  }

  private native void SetPlotCurvePoints_47(int id0);
  public void SetPlotCurvePoints(int id0)
  {
    SetPlotCurvePoints_47(id0);
  }

  private native void PlotCurvePointsOn_48();
  public void PlotCurvePointsOn()
  {
    PlotCurvePointsOn_48();
  }

  private native void PlotCurvePointsOff_49();
  public void PlotCurvePointsOff()
  {
    PlotCurvePointsOff_49();
  }

  private native int GetPlotCurveLines_50();
  public int GetPlotCurveLines()
  {
    return GetPlotCurveLines_50();
  }

  private native void SetPlotCurveLines_51(int id0);
  public void SetPlotCurveLines(int id0)
  {
    SetPlotCurveLines_51(id0);
  }

  private native void PlotCurveLinesOn_52();
  public void PlotCurveLinesOn()
  {
    PlotCurveLinesOn_52();
  }

  private native void PlotCurveLinesOff_53();
  public void PlotCurveLinesOff()
  {
    PlotCurveLinesOff_53();
  }

  private native void SetPlotLines_54(int id0,int id1);
  public void SetPlotLines(int id0,int id1)
  {
    SetPlotLines_54(id0,id1);
  }

  private native int GetPlotLines_55(int id0);
  public int GetPlotLines(int id0)
  {
    return GetPlotLines_55(id0);
  }

  private native void SetPlotPoints_56(int id0,int id1);
  public void SetPlotPoints(int id0,int id1)
  {
    SetPlotPoints_56(id0,id1);
  }

  private native int GetPlotPoints_57(int id0);
  public int GetPlotPoints(int id0)
  {
    return GetPlotPoints_57(id0);
  }

  private native void SetExchangeAxes_58(int id0);
  public void SetExchangeAxes(int id0)
  {
    SetExchangeAxes_58(id0);
  }

  private native int GetExchangeAxes_59();
  public int GetExchangeAxes()
  {
    return GetExchangeAxes_59();
  }

  private native void ExchangeAxesOn_60();
  public void ExchangeAxesOn()
  {
    ExchangeAxesOn_60();
  }

  private native void ExchangeAxesOff_61();
  public void ExchangeAxesOff()
  {
    ExchangeAxesOff_61();
  }

  private native void SetReverseXAxis_62(int id0);
  public void SetReverseXAxis(int id0)
  {
    SetReverseXAxis_62(id0);
  }

  private native int GetReverseXAxis_63();
  public int GetReverseXAxis()
  {
    return GetReverseXAxis_63();
  }

  private native void ReverseXAxisOn_64();
  public void ReverseXAxisOn()
  {
    ReverseXAxisOn_64();
  }

  private native void ReverseXAxisOff_65();
  public void ReverseXAxisOff()
  {
    ReverseXAxisOff_65();
  }

  private native void SetReverseYAxis_66(int id0);
  public void SetReverseYAxis(int id0)
  {
    SetReverseYAxis_66(id0);
  }

  private native int GetReverseYAxis_67();
  public int GetReverseYAxis()
  {
    return GetReverseYAxis_67();
  }

  private native void ReverseYAxisOn_68();
  public void ReverseYAxisOn()
  {
    ReverseYAxisOn_68();
  }

  private native void ReverseYAxisOff_69();
  public void ReverseYAxisOff()
  {
    ReverseYAxisOff_69();
  }

  private native long GetLegendActor_70();
  public vtkLegendBoxActor GetLegendActor()
  {
    long temp = GetLegendActor_70();

    if (temp == 0) return null;
    return (vtkLegendBoxActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGlyphSource_71();
  public vtkGlyphSource2D GetGlyphSource()
  {
    long temp = GetGlyphSource_71();

    if (temp == 0) return null;
    return (vtkGlyphSource2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTitle_72(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_72(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_73();
  public String GetTitle()
  {
    return new String(GetTitle_73(), StandardCharsets.UTF_8);
  }

  private native void SetXTitle_74(byte[] id0, int len0);
  public void SetXTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXTitle_74(bytes0, bytes0.length);
  }

  private native byte[] GetXTitle_75();
  public String GetXTitle()
  {
    return new String(GetXTitle_75(), StandardCharsets.UTF_8);
  }

  private native void SetYTitle_76(byte[] id0, int len0);
  public void SetYTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYTitle_76(bytes0, bytes0.length);
  }

  private native byte[] GetYTitle_77();
  public String GetYTitle()
  {
    return new String(GetYTitle_77(), StandardCharsets.UTF_8);
  }

  private native long GetXAxisActor2D_78();
  public vtkAxisActor2D GetXAxisActor2D()
  {
    long temp = GetXAxisActor2D_78();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYAxisActor2D_79();
  public vtkAxisActor2D GetYAxisActor2D()
  {
    long temp = GetYAxisActor2D_79();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXRange_80(double id0,double id1);
  public void SetXRange(double id0,double id1)
  {
    SetXRange_80(id0,id1);
  }

  private native void SetXRange_81(double id0[]);
  public void SetXRange(double id0[])
  {
    SetXRange_81(id0);
  }

  private native double[] GetXRange_82();
  public double[] GetXRange()
  {
    return GetXRange_82();
  }

  private native void SetYRange_83(double id0,double id1);
  public void SetYRange(double id0,double id1)
  {
    SetYRange_83(id0,id1);
  }

  private native void SetYRange_84(double id0[]);
  public void SetYRange(double id0[])
  {
    SetYRange_84(id0);
  }

  private native double[] GetYRange_85();
  public double[] GetYRange()
  {
    return GetYRange_85();
  }

  private native void SetPlotRange_86(double id0,double id1,double id2,double id3);
  public void SetPlotRange(double id0,double id1,double id2,double id3)
  {
    SetPlotRange_86(id0,id1,id2,id3);
  }

  private native void SetNumberOfXLabels_87(int id0);
  public void SetNumberOfXLabels(int id0)
  {
    SetNumberOfXLabels_87(id0);
  }

  private native int GetNumberOfXLabelsMinValue_88();
  public int GetNumberOfXLabelsMinValue()
  {
    return GetNumberOfXLabelsMinValue_88();
  }

  private native int GetNumberOfXLabelsMaxValue_89();
  public int GetNumberOfXLabelsMaxValue()
  {
    return GetNumberOfXLabelsMaxValue_89();
  }

  private native int GetNumberOfXLabels_90();
  public int GetNumberOfXLabels()
  {
    return GetNumberOfXLabels_90();
  }

  private native void SetNumberOfYLabels_91(int id0);
  public void SetNumberOfYLabels(int id0)
  {
    SetNumberOfYLabels_91(id0);
  }

  private native int GetNumberOfYLabelsMinValue_92();
  public int GetNumberOfYLabelsMinValue()
  {
    return GetNumberOfYLabelsMinValue_92();
  }

  private native int GetNumberOfYLabelsMaxValue_93();
  public int GetNumberOfYLabelsMaxValue()
  {
    return GetNumberOfYLabelsMaxValue_93();
  }

  private native int GetNumberOfYLabels_94();
  public int GetNumberOfYLabels()
  {
    return GetNumberOfYLabels_94();
  }

  private native void SetNumberOfLabels_95(int id0);
  public void SetNumberOfLabels(int id0)
  {
    SetNumberOfLabels_95(id0);
  }

  private native void SetAdjustXLabels_96(int id0);
  public void SetAdjustXLabels(int id0)
  {
    SetAdjustXLabels_96(id0);
  }

  private native int GetAdjustXLabels_97();
  public int GetAdjustXLabels()
  {
    return GetAdjustXLabels_97();
  }

  private native void SetAdjustYLabels_98(int id0);
  public void SetAdjustYLabels(int id0)
  {
    SetAdjustYLabels_98(id0);
  }

  private native int GetAdjustYLabels_99();
  public int GetAdjustYLabels()
  {
    return GetAdjustYLabels_99();
  }

  private native void SetNumberOfXMinorTicks_100(int id0);
  public void SetNumberOfXMinorTicks(int id0)
  {
    SetNumberOfXMinorTicks_100(id0);
  }

  private native int GetNumberOfXMinorTicks_101();
  public int GetNumberOfXMinorTicks()
  {
    return GetNumberOfXMinorTicks_101();
  }

  private native void SetNumberOfYMinorTicks_102(int id0);
  public void SetNumberOfYMinorTicks(int id0)
  {
    SetNumberOfYMinorTicks_102(id0);
  }

  private native int GetNumberOfYMinorTicks_103();
  public int GetNumberOfYMinorTicks()
  {
    return GetNumberOfYMinorTicks_103();
  }

  private native void SetLegend_104(int id0);
  public void SetLegend(int id0)
  {
    SetLegend_104(id0);
  }

  private native int GetLegend_105();
  public int GetLegend()
  {
    return GetLegend_105();
  }

  private native void LegendOn_106();
  public void LegendOn()
  {
    LegendOn_106();
  }

  private native void LegendOff_107();
  public void LegendOff()
  {
    LegendOff_107();
  }

  private native void SetTitlePosition_108(double id0,double id1);
  public void SetTitlePosition(double id0,double id1)
  {
    SetTitlePosition_108(id0,id1);
  }

  private native void SetTitlePosition_109(double id0[]);
  public void SetTitlePosition(double id0[])
  {
    SetTitlePosition_109(id0);
  }

  private native double[] GetTitlePosition_110();
  public double[] GetTitlePosition()
  {
    return GetTitlePosition_110();
  }

  private native void SetAdjustTitlePosition_111(int id0);
  public void SetAdjustTitlePosition(int id0)
  {
    SetAdjustTitlePosition_111(id0);
  }

  private native int GetAdjustTitlePosition_112();
  public int GetAdjustTitlePosition()
  {
    return GetAdjustTitlePosition_112();
  }

  private native void AdjustTitlePositionOn_113();
  public void AdjustTitlePositionOn()
  {
    AdjustTitlePositionOn_113();
  }

  private native void AdjustTitlePositionOff_114();
  public void AdjustTitlePositionOff()
  {
    AdjustTitlePositionOff_114();
  }

  private native void SetAdjustTitlePositionMode_115(int id0);
  public void SetAdjustTitlePositionMode(int id0)
  {
    SetAdjustTitlePositionMode_115(id0);
  }

  private native int GetAdjustTitlePositionMode_116();
  public int GetAdjustTitlePositionMode()
  {
    return GetAdjustTitlePositionMode_116();
  }

  private native void SetLegendPosition_117(double id0,double id1);
  public void SetLegendPosition(double id0,double id1)
  {
    SetLegendPosition_117(id0,id1);
  }

  private native void SetLegendPosition_118(double id0[]);
  public void SetLegendPosition(double id0[])
  {
    SetLegendPosition_118(id0);
  }

  private native double[] GetLegendPosition_119();
  public double[] GetLegendPosition()
  {
    return GetLegendPosition_119();
  }

  private native void SetLegendPosition2_120(double id0,double id1);
  public void SetLegendPosition2(double id0,double id1)
  {
    SetLegendPosition2_120(id0,id1);
  }

  private native void SetLegendPosition2_121(double id0[]);
  public void SetLegendPosition2(double id0[])
  {
    SetLegendPosition2_121(id0);
  }

  private native double[] GetLegendPosition2_122();
  public double[] GetLegendPosition2()
  {
    return GetLegendPosition2_122();
  }

  private native void SetTitleTextProperty_123(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_123(id0);
  }

  private native long GetTitleTextProperty_124();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_124();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisTitleTextProperty_125(vtkTextProperty id0);
  public void SetAxisTitleTextProperty(vtkTextProperty id0)
  {
    SetAxisTitleTextProperty_125(id0);
  }

  private native long GetAxisTitleTextProperty_126();
  public vtkTextProperty GetAxisTitleTextProperty()
  {
    long temp = GetAxisTitleTextProperty_126();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisLabelTextProperty_127(vtkTextProperty id0);
  public void SetAxisLabelTextProperty(vtkTextProperty id0)
  {
    SetAxisLabelTextProperty_127(id0);
  }

  private native long GetAxisLabelTextProperty_128();
  public vtkTextProperty GetAxisLabelTextProperty()
  {
    long temp = GetAxisLabelTextProperty_128();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLogx_129(int id0);
  public void SetLogx(int id0)
  {
    SetLogx_129(id0);
  }

  private native int GetLogx_130();
  public int GetLogx()
  {
    return GetLogx_130();
  }

  private native void LogxOn_131();
  public void LogxOn()
  {
    LogxOn_131();
  }

  private native void LogxOff_132();
  public void LogxOff()
  {
    LogxOff_132();
  }

  private native void SetLabelFormat_133(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_133(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_134();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_134(), StandardCharsets.UTF_8);
  }

  private native void SetXLabelFormat_135(byte[] id0, int len0);
  public void SetXLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXLabelFormat_135(bytes0, bytes0.length);
  }

  private native byte[] GetXLabelFormat_136();
  public String GetXLabelFormat()
  {
    return new String(GetXLabelFormat_136(), StandardCharsets.UTF_8);
  }

  private native void SetYLabelFormat_137(byte[] id0, int len0);
  public void SetYLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYLabelFormat_137(bytes0, bytes0.length);
  }

  private native byte[] GetYLabelFormat_138();
  public String GetYLabelFormat()
  {
    return new String(GetYLabelFormat_138(), StandardCharsets.UTF_8);
  }

  private native void SetBorder_139(int id0);
  public void SetBorder(int id0)
  {
    SetBorder_139(id0);
  }

  private native int GetBorderMinValue_140();
  public int GetBorderMinValue()
  {
    return GetBorderMinValue_140();
  }

  private native int GetBorderMaxValue_141();
  public int GetBorderMaxValue()
  {
    return GetBorderMaxValue_141();
  }

  private native int GetBorder_142();
  public int GetBorder()
  {
    return GetBorder_142();
  }

  private native int GetPlotPoints_143();
  public int GetPlotPoints()
  {
    return GetPlotPoints_143();
  }

  private native void SetPlotPoints_144(int id0);
  public void SetPlotPoints(int id0)
  {
    SetPlotPoints_144(id0);
  }

  private native void PlotPointsOn_145();
  public void PlotPointsOn()
  {
    PlotPointsOn_145();
  }

  private native void PlotPointsOff_146();
  public void PlotPointsOff()
  {
    PlotPointsOff_146();
  }

  private native int GetPlotLines_147();
  public int GetPlotLines()
  {
    return GetPlotLines_147();
  }

  private native void SetPlotLines_148(int id0);
  public void SetPlotLines(int id0)
  {
    SetPlotLines_148(id0);
  }

  private native void PlotLinesOn_149();
  public void PlotLinesOn()
  {
    PlotLinesOn_149();
  }

  private native void PlotLinesOff_150();
  public void PlotLinesOff()
  {
    PlotLinesOff_150();
  }

  private native void SetGlyphSize_151(double id0);
  public void SetGlyphSize(double id0)
  {
    SetGlyphSize_151(id0);
  }

  private native double GetGlyphSizeMinValue_152();
  public double GetGlyphSizeMinValue()
  {
    return GetGlyphSizeMinValue_152();
  }

  private native double GetGlyphSizeMaxValue_153();
  public double GetGlyphSizeMaxValue()
  {
    return GetGlyphSizeMaxValue_153();
  }

  private native double GetGlyphSize_154();
  public double GetGlyphSize()
  {
    return GetGlyphSize_154();
  }

  private native void ViewportToPlotCoordinate_155(vtkViewport id0);
  public void ViewportToPlotCoordinate(vtkViewport id0)
  {
    ViewportToPlotCoordinate_155(id0);
  }

  private native void SetPlotCoordinate_156(double id0,double id1);
  public void SetPlotCoordinate(double id0,double id1)
  {
    SetPlotCoordinate_156(id0,id1);
  }

  private native void SetPlotCoordinate_157(double id0[]);
  public void SetPlotCoordinate(double id0[])
  {
    SetPlotCoordinate_157(id0);
  }

  private native double[] GetPlotCoordinate_158();
  public double[] GetPlotCoordinate()
  {
    return GetPlotCoordinate_158();
  }

  private native void PlotToViewportCoordinate_159(vtkViewport id0);
  public void PlotToViewportCoordinate(vtkViewport id0)
  {
    PlotToViewportCoordinate_159(id0);
  }

  private native void SetViewportCoordinate_160(double id0,double id1);
  public void SetViewportCoordinate(double id0,double id1)
  {
    SetViewportCoordinate_160(id0,id1);
  }

  private native void SetViewportCoordinate_161(double id0[]);
  public void SetViewportCoordinate(double id0[])
  {
    SetViewportCoordinate_161(id0);
  }

  private native double[] GetViewportCoordinate_162();
  public double[] GetViewportCoordinate()
  {
    return GetViewportCoordinate_162();
  }

  private native int IsInPlot_163(vtkViewport id0,double id1,double id2);
  public int IsInPlot(vtkViewport id0,double id1,double id2)
  {
    return IsInPlot_163(id0,id1,id2);
  }

  private native void SetChartBox_164(int id0);
  public void SetChartBox(int id0)
  {
    SetChartBox_164(id0);
  }

  private native int GetChartBox_165();
  public int GetChartBox()
  {
    return GetChartBox_165();
  }

  private native void ChartBoxOn_166();
  public void ChartBoxOn()
  {
    ChartBoxOn_166();
  }

  private native void ChartBoxOff_167();
  public void ChartBoxOff()
  {
    ChartBoxOff_167();
  }

  private native void SetChartBorder_168(int id0);
  public void SetChartBorder(int id0)
  {
    SetChartBorder_168(id0);
  }

  private native int GetChartBorder_169();
  public int GetChartBorder()
  {
    return GetChartBorder_169();
  }

  private native void ChartBorderOn_170();
  public void ChartBorderOn()
  {
    ChartBorderOn_170();
  }

  private native void ChartBorderOff_171();
  public void ChartBorderOff()
  {
    ChartBorderOff_171();
  }

  private native long GetChartBoxProperty_172();
  public vtkProperty2D GetChartBoxProperty()
  {
    long temp = GetChartBoxProperty_172();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetShowReferenceXLine_173(int id0);
  public void SetShowReferenceXLine(int id0)
  {
    SetShowReferenceXLine_173(id0);
  }

  private native int GetShowReferenceXLine_174();
  public int GetShowReferenceXLine()
  {
    return GetShowReferenceXLine_174();
  }

  private native void ShowReferenceXLineOn_175();
  public void ShowReferenceXLineOn()
  {
    ShowReferenceXLineOn_175();
  }

  private native void ShowReferenceXLineOff_176();
  public void ShowReferenceXLineOff()
  {
    ShowReferenceXLineOff_176();
  }

  private native void SetReferenceXValue_177(double id0);
  public void SetReferenceXValue(double id0)
  {
    SetReferenceXValue_177(id0);
  }

  private native double GetReferenceXValue_178();
  public double GetReferenceXValue()
  {
    return GetReferenceXValue_178();
  }

  private native void SetShowReferenceYLine_179(int id0);
  public void SetShowReferenceYLine(int id0)
  {
    SetShowReferenceYLine_179(id0);
  }

  private native int GetShowReferenceYLine_180();
  public int GetShowReferenceYLine()
  {
    return GetShowReferenceYLine_180();
  }

  private native void ShowReferenceYLineOn_181();
  public void ShowReferenceYLineOn()
  {
    ShowReferenceYLineOn_181();
  }

  private native void ShowReferenceYLineOff_182();
  public void ShowReferenceYLineOff()
  {
    ShowReferenceYLineOff_182();
  }

  private native void SetReferenceYValue_183(double id0);
  public void SetReferenceYValue(double id0)
  {
    SetReferenceYValue_183(id0);
  }

  private native double GetReferenceYValue_184();
  public double GetReferenceYValue()
  {
    return GetReferenceYValue_184();
  }

  private native long GetMTime_185();
  public long GetMTime()
  {
    return GetMTime_185();
  }

  private native int RenderOpaqueGeometry_186(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_186(id0);
  }

  private native int RenderOverlay_187(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_187(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_188(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_188(id0);
  }

  private native int HasTranslucentPolygonalGeometry_189();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_189();
  }

  private native void ReleaseGraphicsResources_190(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_190(id0);
  }

  private native void SetXTitlePosition_191(double id0);
  public void SetXTitlePosition(double id0)
  {
    SetXTitlePosition_191(id0);
  }

  private native double GetXTitlePosition_192();
  public double GetXTitlePosition()
  {
    return GetXTitlePosition_192();
  }

  private native void SetYTitlePosition_193(int id0);
  public void SetYTitlePosition(int id0)
  {
    SetYTitlePosition_193(id0);
  }

  private native int GetYTitlePosition_194();
  public int GetYTitlePosition()
  {
    return GetYTitlePosition_194();
  }

  private native void SetYTitlePositionToTop_195();
  public void SetYTitlePositionToTop()
  {
    SetYTitlePositionToTop_195();
  }

  private native void SetYTitlePositionToHCenter_196();
  public void SetYTitlePositionToHCenter()
  {
    SetYTitlePositionToHCenter_196();
  }

  private native void SetYTitlePositionToVCenter_197();
  public void SetYTitlePositionToVCenter()
  {
    SetYTitlePositionToVCenter_197();
  }

  private native void SetPlotGlyphType_198(int id0,int id1);
  public void SetPlotGlyphType(int id0,int id1)
  {
    SetPlotGlyphType_198(id0,id1);
  }

  private native void SetLineWidth_199(double id0);
  public void SetLineWidth(double id0)
  {
    SetLineWidth_199(id0);
  }

  private native void AddUserCurvesPoint_200(double id0,double id1,double id2);
  public void AddUserCurvesPoint(double id0,double id1,double id2)
  {
    AddUserCurvesPoint_200(id0,id1,id2);
  }

  private native void RemoveAllActiveCurves_201();
  public void RemoveAllActiveCurves()
  {
    RemoveAllActiveCurves_201();
  }

  private native void SetLegendBorder_202(int id0);
  public void SetLegendBorder(int id0)
  {
    SetLegendBorder_202(id0);
  }

  private native void SetLegendBox_203(int id0);
  public void SetLegendBox(int id0)
  {
    SetLegendBox_203(id0);
  }

  private native void SetLegendUseBackground_204(int id0);
  public void SetLegendUseBackground(int id0)
  {
    SetLegendUseBackground_204(id0);
  }

  private native void SetLegendBackgroundColor_205(double id0,double id1,double id2);
  public void SetLegendBackgroundColor(double id0,double id1,double id2)
  {
    SetLegendBackgroundColor_205(id0,id1,id2);
  }

  private native void SetTitleColor_206(double id0,double id1,double id2);
  public void SetTitleColor(double id0,double id1,double id2)
  {
    SetTitleColor_206(id0,id1,id2);
  }

  private native void SetTitleFontFamily_207(int id0);
  public void SetTitleFontFamily(int id0)
  {
    SetTitleFontFamily_207(id0);
  }

  private native void SetTitleBold_208(int id0);
  public void SetTitleBold(int id0)
  {
    SetTitleBold_208(id0);
  }

  private native void SetTitleItalic_209(int id0);
  public void SetTitleItalic(int id0)
  {
    SetTitleItalic_209(id0);
  }

  private native void SetTitleShadow_210(int id0);
  public void SetTitleShadow(int id0)
  {
    SetTitleShadow_210(id0);
  }

  private native void SetTitleFontSize_211(int id0);
  public void SetTitleFontSize(int id0)
  {
    SetTitleFontSize_211(id0);
  }

  private native void SetTitleJustification_212(int id0);
  public void SetTitleJustification(int id0)
  {
    SetTitleJustification_212(id0);
  }

  private native void SetTitleVerticalJustification_213(int id0);
  public void SetTitleVerticalJustification(int id0)
  {
    SetTitleVerticalJustification_213(id0);
  }

  private native void SetXAxisColor_214(double id0,double id1,double id2);
  public void SetXAxisColor(double id0,double id1,double id2)
  {
    SetXAxisColor_214(id0,id1,id2);
  }

  private native void SetYAxisColor_215(double id0,double id1,double id2);
  public void SetYAxisColor(double id0,double id1,double id2)
  {
    SetYAxisColor_215(id0,id1,id2);
  }

  private native void SetAxisTitleColor_216(double id0,double id1,double id2);
  public void SetAxisTitleColor(double id0,double id1,double id2)
  {
    SetAxisTitleColor_216(id0,id1,id2);
  }

  private native void SetAxisTitleFontFamily_217(int id0);
  public void SetAxisTitleFontFamily(int id0)
  {
    SetAxisTitleFontFamily_217(id0);
  }

  private native void SetAxisTitleBold_218(int id0);
  public void SetAxisTitleBold(int id0)
  {
    SetAxisTitleBold_218(id0);
  }

  private native void SetAxisTitleItalic_219(int id0);
  public void SetAxisTitleItalic(int id0)
  {
    SetAxisTitleItalic_219(id0);
  }

  private native void SetAxisTitleShadow_220(int id0);
  public void SetAxisTitleShadow(int id0)
  {
    SetAxisTitleShadow_220(id0);
  }

  private native void SetAxisTitleFontSize_221(int id0);
  public void SetAxisTitleFontSize(int id0)
  {
    SetAxisTitleFontSize_221(id0);
  }

  private native void SetAxisTitleJustification_222(int id0);
  public void SetAxisTitleJustification(int id0)
  {
    SetAxisTitleJustification_222(id0);
  }

  private native void SetAxisTitleVerticalJustification_223(int id0);
  public void SetAxisTitleVerticalJustification(int id0)
  {
    SetAxisTitleVerticalJustification_223(id0);
  }

  private native void SetAxisLabelColor_224(double id0,double id1,double id2);
  public void SetAxisLabelColor(double id0,double id1,double id2)
  {
    SetAxisLabelColor_224(id0,id1,id2);
  }

  private native void SetAxisLabelFontFamily_225(int id0);
  public void SetAxisLabelFontFamily(int id0)
  {
    SetAxisLabelFontFamily_225(id0);
  }

  private native void SetAxisLabelBold_226(int id0);
  public void SetAxisLabelBold(int id0)
  {
    SetAxisLabelBold_226(id0);
  }

  private native void SetAxisLabelItalic_227(int id0);
  public void SetAxisLabelItalic(int id0)
  {
    SetAxisLabelItalic_227(id0);
  }

  private native void SetAxisLabelShadow_228(int id0);
  public void SetAxisLabelShadow(int id0)
  {
    SetAxisLabelShadow_228(id0);
  }

  private native void SetAxisLabelFontSize_229(int id0);
  public void SetAxisLabelFontSize(int id0)
  {
    SetAxisLabelFontSize_229(id0);
  }

  private native void SetAxisLabelJustification_230(int id0);
  public void SetAxisLabelJustification(int id0)
  {
    SetAxisLabelJustification_230(id0);
  }

  private native void SetAxisLabelVerticalJustification_231(int id0);
  public void SetAxisLabelVerticalJustification(int id0)
  {
    SetAxisLabelVerticalJustification_231(id0);
  }

  public vtkXYPlotActor() { super(); }

  public vtkXYPlotActor(long id) { super(id); }
  public native long   VTKInit();

}
