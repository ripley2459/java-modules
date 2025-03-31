// java wrapper for vtkImprintFilter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkImprintFilter extends vtkPolyDataAlgorithm
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

  private native void SetTargetConnection_4(vtkAlgorithmOutput id0);
  public void SetTargetConnection(vtkAlgorithmOutput id0)
  {
    SetTargetConnection_4(id0);
  }

  private native long GetTargetConnection_5();
  public vtkAlgorithmOutput GetTargetConnection()
  {
    long temp = GetTargetConnection_5();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTargetData_6(vtkDataObject id0);
  public void SetTargetData(vtkDataObject id0)
  {
    SetTargetData_6(id0);
  }

  private native long GetTarget_7();
  public vtkDataObject GetTarget()
  {
    long temp = GetTarget_7();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImprintConnection_8(vtkAlgorithmOutput id0);
  public void SetImprintConnection(vtkAlgorithmOutput id0)
  {
    SetImprintConnection_8(id0);
  }

  private native long GetImprintConnection_9();
  public vtkAlgorithmOutput GetImprintConnection()
  {
    long temp = GetImprintConnection_9();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImprintData_10(vtkDataObject id0);
  public void SetImprintData(vtkDataObject id0)
  {
    SetImprintData_10(id0);
  }

  private native long GetImprint_11();
  public vtkDataObject GetImprint()
  {
    long temp = GetImprint_11();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTolerance_12(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_12(id0);
  }

  private native double GetToleranceMinValue_13();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_13();
  }

  private native double GetToleranceMaxValue_14();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_14();
  }

  private native double GetTolerance_15();
  public double GetTolerance()
  {
    return GetTolerance_15();
  }

  private native void SetMergeToleranceType_16(int id0);
  public void SetMergeToleranceType(int id0)
  {
    SetMergeToleranceType_16(id0);
  }

  private native int GetMergeToleranceTypeMinValue_17();
  public int GetMergeToleranceTypeMinValue()
  {
    return GetMergeToleranceTypeMinValue_17();
  }

  private native int GetMergeToleranceTypeMaxValue_18();
  public int GetMergeToleranceTypeMaxValue()
  {
    return GetMergeToleranceTypeMaxValue_18();
  }

  private native int GetMergeToleranceType_19();
  public int GetMergeToleranceType()
  {
    return GetMergeToleranceType_19();
  }

  private native void SetMergeToleranceTypeToAbsolute_20();
  public void SetMergeToleranceTypeToAbsolute()
  {
    SetMergeToleranceTypeToAbsolute_20();
  }

  private native void SetMergeToleranceTypeToRelativeToProjection_21();
  public void SetMergeToleranceTypeToRelativeToProjection()
  {
    SetMergeToleranceTypeToRelativeToProjection_21();
  }

  private native void SetMergeToleranceTypeToMinEdge_22();
  public void SetMergeToleranceTypeToMinEdge()
  {
    SetMergeToleranceTypeToMinEdge_22();
  }

  private native void SetMergeTolerance_23(double id0);
  public void SetMergeTolerance(double id0)
  {
    SetMergeTolerance_23(id0);
  }

  private native double GetMergeToleranceMinValue_24();
  public double GetMergeToleranceMinValue()
  {
    return GetMergeToleranceMinValue_24();
  }

  private native double GetMergeToleranceMaxValue_25();
  public double GetMergeToleranceMaxValue()
  {
    return GetMergeToleranceMaxValue_25();
  }

  private native double GetMergeTolerance_26();
  public double GetMergeTolerance()
  {
    return GetMergeTolerance_26();
  }

  private native void SetOutputType_27(int id0);
  public void SetOutputType(int id0)
  {
    SetOutputType_27(id0);
  }

  private native int GetOutputTypeMinValue_28();
  public int GetOutputTypeMinValue()
  {
    return GetOutputTypeMinValue_28();
  }

  private native int GetOutputTypeMaxValue_29();
  public int GetOutputTypeMaxValue()
  {
    return GetOutputTypeMaxValue_29();
  }

  private native int GetOutputType_30();
  public int GetOutputType()
  {
    return GetOutputType_30();
  }

  private native void SetOutputTypeToTargetCells_31();
  public void SetOutputTypeToTargetCells()
  {
    SetOutputTypeToTargetCells_31();
  }

  private native void SetOutputTypeToImprintedCells_32();
  public void SetOutputTypeToImprintedCells()
  {
    SetOutputTypeToImprintedCells_32();
  }

  private native void SetOutputTypeToProjectedImprint_33();
  public void SetOutputTypeToProjectedImprint()
  {
    SetOutputTypeToProjectedImprint_33();
  }

  private native void SetOutputTypeToImprintedRegion_34();
  public void SetOutputTypeToImprintedRegion()
  {
    SetOutputTypeToImprintedRegion_34();
  }

  private native void SetOutputTypeToMergedImprint_35();
  public void SetOutputTypeToMergedImprint()
  {
    SetOutputTypeToMergedImprint_35();
  }

  private native void SetBoundaryEdgeInsertion_36(boolean id0);
  public void SetBoundaryEdgeInsertion(boolean id0)
  {
    SetBoundaryEdgeInsertion_36(id0);
  }

  private native boolean GetBoundaryEdgeInsertion_37();
  public boolean GetBoundaryEdgeInsertion()
  {
    return GetBoundaryEdgeInsertion_37();
  }

  private native void BoundaryEdgeInsertionOn_38();
  public void BoundaryEdgeInsertionOn()
  {
    BoundaryEdgeInsertionOn_38();
  }

  private native void BoundaryEdgeInsertionOff_39();
  public void BoundaryEdgeInsertionOff()
  {
    BoundaryEdgeInsertionOff_39();
  }

  private native void SetPassCellData_40(boolean id0);
  public void SetPassCellData(boolean id0)
  {
    SetPassCellData_40(id0);
  }

  private native boolean GetPassCellData_41();
  public boolean GetPassCellData()
  {
    return GetPassCellData_41();
  }

  private native void PassCellDataOn_42();
  public void PassCellDataOn()
  {
    PassCellDataOn_42();
  }

  private native void PassCellDataOff_43();
  public void PassCellDataOff()
  {
    PassCellDataOff_43();
  }

  private native void SetPassPointData_44(boolean id0);
  public void SetPassPointData(boolean id0)
  {
    SetPassPointData_44(id0);
  }

  private native boolean GetPassPointData_45();
  public boolean GetPassPointData()
  {
    return GetPassPointData_45();
  }

  private native void PassPointDataOn_46();
  public void PassPointDataOn()
  {
    PassPointDataOn_46();
  }

  private native void PassPointDataOff_47();
  public void PassPointDataOff()
  {
    PassPointDataOff_47();
  }

  private native void SetPointInterpolation_48(int id0);
  public void SetPointInterpolation(int id0)
  {
    SetPointInterpolation_48(id0);
  }

  private native int GetPointInterpolationMinValue_49();
  public int GetPointInterpolationMinValue()
  {
    return GetPointInterpolationMinValue_49();
  }

  private native int GetPointInterpolationMaxValue_50();
  public int GetPointInterpolationMaxValue()
  {
    return GetPointInterpolationMaxValue_50();
  }

  private native int GetPointInterpolation_51();
  public int GetPointInterpolation()
  {
    return GetPointInterpolation_51();
  }

  private native void SetPointInterpolationToTargetEdges_52();
  public void SetPointInterpolationToTargetEdges()
  {
    SetPointInterpolationToTargetEdges_52();
  }

  private native void SetPointInterpolationToImprintEdges_53();
  public void SetPointInterpolationToImprintEdges()
  {
    SetPointInterpolationToImprintEdges_53();
  }

  private native void SetTriangulateOutput_54(boolean id0);
  public void SetTriangulateOutput(boolean id0)
  {
    SetTriangulateOutput_54(id0);
  }

  private native boolean GetTriangulateOutput_55();
  public boolean GetTriangulateOutput()
  {
    return GetTriangulateOutput_55();
  }

  private native void TriangulateOutputOn_56();
  public void TriangulateOutputOn()
  {
    TriangulateOutputOn_56();
  }

  private native void TriangulateOutputOff_57();
  public void TriangulateOutputOff()
  {
    TriangulateOutputOff_57();
  }

  private native void SetDebugOutputType_58(int id0);
  public void SetDebugOutputType(int id0)
  {
    SetDebugOutputType_58(id0);
  }

  private native int GetDebugOutputTypeMinValue_59();
  public int GetDebugOutputTypeMinValue()
  {
    return GetDebugOutputTypeMinValue_59();
  }

  private native int GetDebugOutputTypeMaxValue_60();
  public int GetDebugOutputTypeMaxValue()
  {
    return GetDebugOutputTypeMaxValue_60();
  }

  private native int GetDebugOutputType_61();
  public int GetDebugOutputType()
  {
    return GetDebugOutputType_61();
  }

  private native void SetDebugOutputTypeToNoDebugOutput_62();
  public void SetDebugOutputTypeToNoDebugOutput()
  {
    SetDebugOutputTypeToNoDebugOutput_62();
  }

  private native void SetDebugOutputTypeToTriangulationInput_63();
  public void SetDebugOutputTypeToTriangulationInput()
  {
    SetDebugOutputTypeToTriangulationInput_63();
  }

  private native void SetDebugOutputTypeToTriangulationOutput_64();
  public void SetDebugOutputTypeToTriangulationOutput()
  {
    SetDebugOutputTypeToTriangulationOutput_64();
  }

  private native void SetDebugCellId_65(long id0);
  public void SetDebugCellId(long id0)
  {
    SetDebugCellId_65(id0);
  }

  private native long GetDebugCellId_66();
  public long GetDebugCellId()
  {
    return GetDebugCellId_66();
  }

  private native long GetDebugOutput_67();
  public vtkPolyData GetDebugOutput()
  {
    long temp = GetDebugOutput_67();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkImprintFilter() { super(); }

  public vtkImprintFilter(long id) { super(id); }
  public native long   VTKInit();

}
