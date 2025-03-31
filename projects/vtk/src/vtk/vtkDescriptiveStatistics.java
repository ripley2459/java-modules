// java wrapper for vtkDescriptiveStatistics object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkDescriptiveStatistics extends vtkStatisticsAlgorithm
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

  private native void SetUnbiasedVariance_4(int id0);
  public void SetUnbiasedVariance(int id0)
  {
    SetUnbiasedVariance_4(id0);
  }

  private native int GetUnbiasedVariance_5();
  public int GetUnbiasedVariance()
  {
    return GetUnbiasedVariance_5();
  }

  private native void UnbiasedVarianceOn_6();
  public void UnbiasedVarianceOn()
  {
    UnbiasedVarianceOn_6();
  }

  private native void UnbiasedVarianceOff_7();
  public void UnbiasedVarianceOff()
  {
    UnbiasedVarianceOff_7();
  }

  private native void SetG1Skewness_8(int id0);
  public void SetG1Skewness(int id0)
  {
    SetG1Skewness_8(id0);
  }

  private native int GetG1Skewness_9();
  public int GetG1Skewness()
  {
    return GetG1Skewness_9();
  }

  private native void G1SkewnessOn_10();
  public void G1SkewnessOn()
  {
    G1SkewnessOn_10();
  }

  private native void G1SkewnessOff_11();
  public void G1SkewnessOff()
  {
    G1SkewnessOff_11();
  }

  private native void SetG2Kurtosis_12(int id0);
  public void SetG2Kurtosis(int id0)
  {
    SetG2Kurtosis_12(id0);
  }

  private native int GetG2Kurtosis_13();
  public int GetG2Kurtosis()
  {
    return GetG2Kurtosis_13();
  }

  private native void G2KurtosisOn_14();
  public void G2KurtosisOn()
  {
    G2KurtosisOn_14();
  }

  private native void G2KurtosisOff_15();
  public void G2KurtosisOff()
  {
    G2KurtosisOff_15();
  }

  private native void SetSampleEstimate_16(boolean id0);
  public void SetSampleEstimate(boolean id0)
  {
    SetSampleEstimate_16(id0);
  }

  private native boolean GetSampleEstimate_17();
  public boolean GetSampleEstimate()
  {
    return GetSampleEstimate_17();
  }

  private native void SampleEstimateOn_18();
  public void SampleEstimateOn()
  {
    SampleEstimateOn_18();
  }

  private native void SampleEstimateOff_19();
  public void SampleEstimateOff()
  {
    SampleEstimateOff_19();
  }

  private native void SetSignedDeviations_20(int id0);
  public void SetSignedDeviations(int id0)
  {
    SetSignedDeviations_20(id0);
  }

  private native int GetSignedDeviations_21();
  public int GetSignedDeviations()
  {
    return GetSignedDeviations_21();
  }

  private native void SignedDeviationsOn_22();
  public void SignedDeviationsOn()
  {
    SignedDeviationsOn_22();
  }

  private native void SignedDeviationsOff_23();
  public void SignedDeviationsOff()
  {
    SignedDeviationsOff_23();
  }

  private native void SetGhostsToSkip_24(byte id0);
  public void SetGhostsToSkip(byte id0)
  {
    SetGhostsToSkip_24(id0);
  }

  private native byte GetGhostsToSkip_25();
  public byte GetGhostsToSkip()
  {
    return GetGhostsToSkip_25();
  }

  private native void Aggregate_26(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1);
  public void Aggregate(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1)
  {
    Aggregate_26(id0,id1);
  }

  public vtkDescriptiveStatistics() { super(); }

  public vtkDescriptiveStatistics(long id) { super(id); }
  public native long   VTKInit();

}
