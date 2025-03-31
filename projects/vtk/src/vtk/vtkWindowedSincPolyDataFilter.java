// java wrapper for vtkWindowedSincPolyDataFilter object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkWindowedSincPolyDataFilter extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfIterations_4(int id0);
  public void SetNumberOfIterations(int id0)
  {
    SetNumberOfIterations_4(id0);
  }

  private native int GetNumberOfIterationsMinValue_5();
  public int GetNumberOfIterationsMinValue()
  {
    return GetNumberOfIterationsMinValue_5();
  }

  private native int GetNumberOfIterationsMaxValue_6();
  public int GetNumberOfIterationsMaxValue()
  {
    return GetNumberOfIterationsMaxValue_6();
  }

  private native int GetNumberOfIterations_7();
  public int GetNumberOfIterations()
  {
    return GetNumberOfIterations_7();
  }

  private native void SetPassBand_8(double id0);
  public void SetPassBand(double id0)
  {
    SetPassBand_8(id0);
  }

  private native double GetPassBandMinValue_9();
  public double GetPassBandMinValue()
  {
    return GetPassBandMinValue_9();
  }

  private native double GetPassBandMaxValue_10();
  public double GetPassBandMaxValue()
  {
    return GetPassBandMaxValue_10();
  }

  private native double GetPassBand_11();
  public double GetPassBand()
  {
    return GetPassBand_11();
  }

  private native void SetNormalizeCoordinates_12(int id0);
  public void SetNormalizeCoordinates(int id0)
  {
    SetNormalizeCoordinates_12(id0);
  }

  private native int GetNormalizeCoordinates_13();
  public int GetNormalizeCoordinates()
  {
    return GetNormalizeCoordinates_13();
  }

  private native void NormalizeCoordinatesOn_14();
  public void NormalizeCoordinatesOn()
  {
    NormalizeCoordinatesOn_14();
  }

  private native void NormalizeCoordinatesOff_15();
  public void NormalizeCoordinatesOff()
  {
    NormalizeCoordinatesOff_15();
  }

  private native void SetFeatureEdgeSmoothing_16(int id0);
  public void SetFeatureEdgeSmoothing(int id0)
  {
    SetFeatureEdgeSmoothing_16(id0);
  }

  private native int GetFeatureEdgeSmoothing_17();
  public int GetFeatureEdgeSmoothing()
  {
    return GetFeatureEdgeSmoothing_17();
  }

  private native void FeatureEdgeSmoothingOn_18();
  public void FeatureEdgeSmoothingOn()
  {
    FeatureEdgeSmoothingOn_18();
  }

  private native void FeatureEdgeSmoothingOff_19();
  public void FeatureEdgeSmoothingOff()
  {
    FeatureEdgeSmoothingOff_19();
  }

  private native void SetFeatureAngle_20(double id0);
  public void SetFeatureAngle(double id0)
  {
    SetFeatureAngle_20(id0);
  }

  private native double GetFeatureAngleMinValue_21();
  public double GetFeatureAngleMinValue()
  {
    return GetFeatureAngleMinValue_21();
  }

  private native double GetFeatureAngleMaxValue_22();
  public double GetFeatureAngleMaxValue()
  {
    return GetFeatureAngleMaxValue_22();
  }

  private native double GetFeatureAngle_23();
  public double GetFeatureAngle()
  {
    return GetFeatureAngle_23();
  }

  private native void SetEdgeAngle_24(double id0);
  public void SetEdgeAngle(double id0)
  {
    SetEdgeAngle_24(id0);
  }

  private native double GetEdgeAngleMinValue_25();
  public double GetEdgeAngleMinValue()
  {
    return GetEdgeAngleMinValue_25();
  }

  private native double GetEdgeAngleMaxValue_26();
  public double GetEdgeAngleMaxValue()
  {
    return GetEdgeAngleMaxValue_26();
  }

  private native double GetEdgeAngle_27();
  public double GetEdgeAngle()
  {
    return GetEdgeAngle_27();
  }

  private native void SetBoundarySmoothing_28(int id0);
  public void SetBoundarySmoothing(int id0)
  {
    SetBoundarySmoothing_28(id0);
  }

  private native int GetBoundarySmoothing_29();
  public int GetBoundarySmoothing()
  {
    return GetBoundarySmoothing_29();
  }

  private native void BoundarySmoothingOn_30();
  public void BoundarySmoothingOn()
  {
    BoundarySmoothingOn_30();
  }

  private native void BoundarySmoothingOff_31();
  public void BoundarySmoothingOff()
  {
    BoundarySmoothingOff_31();
  }

  private native void SetNonManifoldSmoothing_32(int id0);
  public void SetNonManifoldSmoothing(int id0)
  {
    SetNonManifoldSmoothing_32(id0);
  }

  private native int GetNonManifoldSmoothing_33();
  public int GetNonManifoldSmoothing()
  {
    return GetNonManifoldSmoothing_33();
  }

  private native void NonManifoldSmoothingOn_34();
  public void NonManifoldSmoothingOn()
  {
    NonManifoldSmoothingOn_34();
  }

  private native void NonManifoldSmoothingOff_35();
  public void NonManifoldSmoothingOff()
  {
    NonManifoldSmoothingOff_35();
  }

  private native void SetWeightNonManifoldEdges_36(int id0);
  public void SetWeightNonManifoldEdges(int id0)
  {
    SetWeightNonManifoldEdges_36(id0);
  }

  private native int GetWeightNonManifoldEdges_37();
  public int GetWeightNonManifoldEdges()
  {
    return GetWeightNonManifoldEdges_37();
  }

  private native void WeightNonManifoldEdgesOn_38();
  public void WeightNonManifoldEdgesOn()
  {
    WeightNonManifoldEdgesOn_38();
  }

  private native void WeightNonManifoldEdgesOff_39();
  public void WeightNonManifoldEdgesOff()
  {
    WeightNonManifoldEdgesOff_39();
  }

  private native void SetGenerateErrorScalars_40(int id0);
  public void SetGenerateErrorScalars(int id0)
  {
    SetGenerateErrorScalars_40(id0);
  }

  private native int GetGenerateErrorScalars_41();
  public int GetGenerateErrorScalars()
  {
    return GetGenerateErrorScalars_41();
  }

  private native void GenerateErrorScalarsOn_42();
  public void GenerateErrorScalarsOn()
  {
    GenerateErrorScalarsOn_42();
  }

  private native void GenerateErrorScalarsOff_43();
  public void GenerateErrorScalarsOff()
  {
    GenerateErrorScalarsOff_43();
  }

  private native void SetGenerateErrorVectors_44(int id0);
  public void SetGenerateErrorVectors(int id0)
  {
    SetGenerateErrorVectors_44(id0);
  }

  private native int GetGenerateErrorVectors_45();
  public int GetGenerateErrorVectors()
  {
    return GetGenerateErrorVectors_45();
  }

  private native void GenerateErrorVectorsOn_46();
  public void GenerateErrorVectorsOn()
  {
    GenerateErrorVectorsOn_46();
  }

  private native void GenerateErrorVectorsOff_47();
  public void GenerateErrorVectorsOff()
  {
    GenerateErrorVectorsOff_47();
  }

  public vtkWindowedSincPolyDataFilter() { super(); }

  public vtkWindowedSincPolyDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
