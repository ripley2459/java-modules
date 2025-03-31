// java wrapper for vtkParticleTracerBase object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkParticleTracerBase extends vtkPolyDataAlgorithm
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

  private native void PrintParticleHistories_4();
  public void PrintParticleHistories()
  {
    PrintParticleHistories_4();
  }

  private native boolean GetComputeVorticity_5();
  public boolean GetComputeVorticity()
  {
    return GetComputeVorticity_5();
  }

  private native void SetComputeVorticity_6(boolean id0);
  public void SetComputeVorticity(boolean id0)
  {
    SetComputeVorticity_6(id0);
  }

  private native double GetTerminalSpeed_7();
  public double GetTerminalSpeed()
  {
    return GetTerminalSpeed_7();
  }

  private native void SetTerminalSpeed_8(double id0);
  public void SetTerminalSpeed(double id0)
  {
    SetTerminalSpeed_8(id0);
  }

  private native double GetRotationScale_9();
  public double GetRotationScale()
  {
    return GetRotationScale_9();
  }

  private native void SetRotationScale_10(double id0);
  public void SetRotationScale(double id0)
  {
    SetRotationScale_10(id0);
  }

  private native void SetIgnorePipelineTime_11(int id0);
  public void SetIgnorePipelineTime(int id0)
  {
    SetIgnorePipelineTime_11(id0);
  }

  private native int GetIgnorePipelineTime_12();
  public int GetIgnorePipelineTime()
  {
    return GetIgnorePipelineTime_12();
  }

  private native void IgnorePipelineTimeOn_13();
  public void IgnorePipelineTimeOn()
  {
    IgnorePipelineTimeOn_13();
  }

  private native void IgnorePipelineTimeOff_14();
  public void IgnorePipelineTimeOff()
  {
    IgnorePipelineTimeOff_14();
  }

  private native int GetForceReinjectionEveryNSteps_15();
  public int GetForceReinjectionEveryNSteps()
  {
    return GetForceReinjectionEveryNSteps_15();
  }

  private native void SetForceReinjectionEveryNSteps_16(int id0);
  public void SetForceReinjectionEveryNSteps(int id0)
  {
    SetForceReinjectionEveryNSteps_16(id0);
  }

  private native void SetTerminationTime_17(double id0);
  public void SetTerminationTime(double id0)
  {
    SetTerminationTime_17(id0);
  }

  private native double GetTerminationTime_18();
  public double GetTerminationTime()
  {
    return GetTerminationTime_18();
  }

  private native void SetIntegrator_19(vtkInitialValueProblemSolver id0);
  public void SetIntegrator(vtkInitialValueProblemSolver id0)
  {
    SetIntegrator_19(id0);
  }

  private native long GetIntegrator_20();
  public vtkInitialValueProblemSolver GetIntegrator()
  {
    long temp = GetIntegrator_20();

    if (temp == 0) return null;
    return (vtkInitialValueProblemSolver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIntegratorType_21(int id0);
  public void SetIntegratorType(int id0)
  {
    SetIntegratorType_21(id0);
  }

  private native int GetIntegratorType_22();
  public int GetIntegratorType()
  {
    return GetIntegratorType_22();
  }

  private native double GetStartTime_23();
  public double GetStartTime()
  {
    return GetStartTime_23();
  }

  private native void SetStartTime_24(double id0);
  public void SetStartTime(double id0)
  {
    SetStartTime_24(id0);
  }

  private native void SetStaticSeeds_25(int id0);
  public void SetStaticSeeds(int id0)
  {
    SetStaticSeeds_25(id0);
  }

  private native int GetStaticSeeds_26();
  public int GetStaticSeeds()
  {
    return GetStaticSeeds_26();
  }

  private native void SetMeshOverTime_27(int id0);
  public void SetMeshOverTime(int id0)
  {
    SetMeshOverTime_27(id0);
  }

  private native int GetMeshOverTimeMinValue_28();
  public int GetMeshOverTimeMinValue()
  {
    return GetMeshOverTimeMinValue_28();
  }

  private native int GetMeshOverTimeMaxValue_29();
  public int GetMeshOverTimeMaxValue()
  {
    return GetMeshOverTimeMaxValue_29();
  }

  private native void SetMeshOverTimeToDifferent_30();
  public void SetMeshOverTimeToDifferent()
  {
    SetMeshOverTimeToDifferent_30();
  }

  private native void SetMeshOverTimeToStatic_31();
  public void SetMeshOverTimeToStatic()
  {
    SetMeshOverTimeToStatic_31();
  }

  private native void SetMeshOverTimeToLinearTransformation_32();
  public void SetMeshOverTimeToLinearTransformation()
  {
    SetMeshOverTimeToLinearTransformation_32();
  }

  private native void SetMeshOverTimeToSameTopology_33();
  public void SetMeshOverTimeToSameTopology()
  {
    SetMeshOverTimeToSameTopology_33();
  }

  private native int GetMeshOverTime_34();
  public int GetMeshOverTime()
  {
    return GetMeshOverTime_34();
  }

  private native void SetStaticMesh_35(int id0);
  public void SetStaticMesh(int id0)
  {
    SetStaticMesh_35(id0);
  }

  private native int GetStaticMesh_36();
  public int GetStaticMesh()
  {
    return GetStaticMesh_36();
  }

  private native void SetInterpolatorType_37(int id0);
  public void SetInterpolatorType(int id0)
  {
    SetInterpolatorType_37(id0);
  }

  private native void SetInterpolatorTypeToDataSetPointLocator_38();
  public void SetInterpolatorTypeToDataSetPointLocator()
  {
    SetInterpolatorTypeToDataSetPointLocator_38();
  }

  private native void SetInterpolatorTypeToCellLocator_39();
  public void SetInterpolatorTypeToCellLocator()
  {
    SetInterpolatorTypeToCellLocator_39();
  }

  private native void SetParticleWriter_40(vtkAbstractParticleWriter id0);
  public void SetParticleWriter(vtkAbstractParticleWriter id0)
  {
    SetParticleWriter_40(id0);
  }

  private native long GetParticleWriter_41();
  public vtkAbstractParticleWriter GetParticleWriter()
  {
    long temp = GetParticleWriter_41();

    if (temp == 0) return null;
    return (vtkAbstractParticleWriter)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetParticleFileName_42(byte[] id0, int len0);
  public void SetParticleFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParticleFileName_42(bytes0, bytes0.length);
  }

  private native byte[] GetParticleFileName_43();
  public String GetParticleFileName()
  {
    return new String(GetParticleFileName_43(), StandardCharsets.UTF_8);
  }

  private native void SetEnableParticleWriting_44(int id0);
  public void SetEnableParticleWriting(int id0)
  {
    SetEnableParticleWriting_44(id0);
  }

  private native int GetEnableParticleWriting_45();
  public int GetEnableParticleWriting()
  {
    return GetEnableParticleWriting_45();
  }

  private native void EnableParticleWritingOn_46();
  public void EnableParticleWritingOn()
  {
    EnableParticleWritingOn_46();
  }

  private native void EnableParticleWritingOff_47();
  public void EnableParticleWritingOff()
  {
    EnableParticleWritingOff_47();
  }

  private native void SetDisableResetCache_48(int id0);
  public void SetDisableResetCache(int id0)
  {
    SetDisableResetCache_48(id0);
  }

  private native int GetDisableResetCache_49();
  public int GetDisableResetCache()
  {
    return GetDisableResetCache_49();
  }

  private native void DisableResetCacheOn_50();
  public void DisableResetCacheOn()
  {
    DisableResetCacheOn_50();
  }

  private native void DisableResetCacheOff_51();
  public void DisableResetCacheOff()
  {
    DisableResetCacheOff_51();
  }

  private native void AddSourceConnection_52(vtkAlgorithmOutput id0);
  public void AddSourceConnection(vtkAlgorithmOutput id0)
  {
    AddSourceConnection_52(id0);
  }

  private native void RemoveAllSources_53();
  public void RemoveAllSources()
  {
    RemoveAllSources_53();
  }

  private native boolean GetForceSerialExecution_54();
  public boolean GetForceSerialExecution()
  {
    return GetForceSerialExecution_54();
  }

  private native void SetForceSerialExecution_55(boolean id0);
  public void SetForceSerialExecution(boolean id0)
  {
    SetForceSerialExecution_55(id0);
  }

  private native void ForceSerialExecutionOn_56();
  public void ForceSerialExecutionOn()
  {
    ForceSerialExecutionOn_56();
  }

  private native void ForceSerialExecutionOff_57();
  public void ForceSerialExecutionOff()
  {
    ForceSerialExecutionOff_57();
  }

  public vtkParticleTracerBase() { super(); }

  public vtkParticleTracerBase(long id) { super(id); }

}
