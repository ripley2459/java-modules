// java wrapper for vtkMath object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkMath extends vtkObject
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

  private native double Pi_4();
  public double Pi()
  {
    return Pi_4();
  }

  private native float RadiansFromDegrees_5(float id0);
  public float RadiansFromDegrees(float id0)
  {
    return RadiansFromDegrees_5(id0);
  }

  private native double RadiansFromDegrees_6(double id0);
  public double RadiansFromDegrees(double id0)
  {
    return RadiansFromDegrees_6(id0);
  }

  private native float DegreesFromRadians_7(float id0);
  public float DegreesFromRadians(float id0)
  {
    return DegreesFromRadians_7(id0);
  }

  private native double DegreesFromRadians_8(double id0);
  public double DegreesFromRadians(double id0)
  {
    return DegreesFromRadians_8(id0);
  }

  private native int Round_9(float id0);
  public int Round(float id0)
  {
    return Round_9(id0);
  }

  private native int Round_10(double id0);
  public int Round(double id0)
  {
    return Round_10(id0);
  }

  private native int Floor_11(double id0);
  public int Floor(double id0)
  {
    return Floor_11(id0);
  }

  private native int Ceil_12(double id0);
  public int Ceil(double id0)
  {
    return Ceil_12(id0);
  }

  private native int CeilLog2_13(long id0);
  public int CeilLog2(long id0)
  {
    return CeilLog2_13(id0);
  }

  private native boolean IsPowerOfTwo_14(long id0);
  public boolean IsPowerOfTwo(long id0)
  {
    return IsPowerOfTwo_14(id0);
  }

  private native int NearestPowerOfTwo_15(int id0);
  public int NearestPowerOfTwo(int id0)
  {
    return NearestPowerOfTwo_15(id0);
  }

  private native long Factorial_16(int id0);
  public long Factorial(int id0)
  {
    return Factorial_16(id0);
  }

  private native long Binomial_17(int id0,int id1);
  public long Binomial(int id0,int id1)
  {
    return Binomial_17(id0,id1);
  }

  private native void RandomSeed_18(int id0);
  public void RandomSeed(int id0)
  {
    RandomSeed_18(id0);
  }

  private native int GetSeed_19();
  public int GetSeed()
  {
    return GetSeed_19();
  }

  private native double Random_20();
  public double Random()
  {
    return Random_20();
  }

  private native double Random_21(double id0,double id1);
  public double Random(double id0,double id1)
  {
    return Random_21(id0,id1);
  }

  private native double Gaussian_22();
  public double Gaussian()
  {
    return Gaussian_22();
  }

  private native double Gaussian_23(double id0,double id1);
  public double Gaussian(double id0,double id1)
  {
    return Gaussian_23(id0,id1);
  }

  private native void Assign_24(double id0[],double id1[]);
  public void Assign(double id0[],double id1[])
  {
    Assign_24(id0,id1);
  }

  private native void Add_25(float id0[],float id1[],float id2[]);
  public void Add(float id0[],float id1[],float id2[])
  {
    Add_25(id0,id1,id2);
  }

  private native void Add_26(double id0[],double id1[],double id2[]);
  public void Add(double id0[],double id1[],double id2[])
  {
    Add_26(id0,id1,id2);
  }

  private native void Subtract_27(float id0[],float id1[],float id2[]);
  public void Subtract(float id0[],float id1[],float id2[])
  {
    Subtract_27(id0,id1,id2);
  }

  private native void Subtract_28(double id0[],double id1[],double id2[]);
  public void Subtract(double id0[],double id1[],double id2[])
  {
    Subtract_28(id0,id1,id2);
  }

  private native void MultiplyScalar_29(float id0[],float id1);
  public void MultiplyScalar(float id0[],float id1)
  {
    MultiplyScalar_29(id0,id1);
  }

  private native void MultiplyScalar2D_30(float id0[],float id1);
  public void MultiplyScalar2D(float id0[],float id1)
  {
    MultiplyScalar2D_30(id0,id1);
  }

  private native void MultiplyScalar_31(double id0[],double id1);
  public void MultiplyScalar(double id0[],double id1)
  {
    MultiplyScalar_31(id0,id1);
  }

  private native void MultiplyScalar2D_32(double id0[],double id1);
  public void MultiplyScalar2D(double id0[],double id1)
  {
    MultiplyScalar2D_32(id0,id1);
  }

  private native float Dot_33(float id0[],float id1[]);
  public float Dot(float id0[],float id1[])
  {
    return Dot_33(id0,id1);
  }

  private native double Dot_34(double id0[],double id1[]);
  public double Dot(double id0[],double id1[])
  {
    return Dot_34(id0,id1);
  }

  private native void Cross_35(float id0[],float id1[],float id2[]);
  public void Cross(float id0[],float id1[],float id2[])
  {
    Cross_35(id0,id1,id2);
  }

  private native void Cross_36(double id0[],double id1[],double id2[]);
  public void Cross(double id0[],double id1[],double id2[])
  {
    Cross_36(id0,id1,id2);
  }

  private native float Norm_37(float id0[]);
  public float Norm(float id0[])
  {
    return Norm_37(id0);
  }

  private native double Norm_38(double id0[]);
  public double Norm(double id0[])
  {
    return Norm_38(id0);
  }

  private native float Normalize_39(float id0[]);
  public float Normalize(float id0[])
  {
    return Normalize_39(id0);
  }

  private native double Normalize_40(double id0[]);
  public double Normalize(double id0[])
  {
    return Normalize_40(id0);
  }

  private native void Perpendiculars_41(double id0[],double id1[],double id2[],double id3);
  public void Perpendiculars(double id0[],double id1[],double id2[],double id3)
  {
    Perpendiculars_41(id0,id1,id2,id3);
  }

  private native void Perpendiculars_42(float id0[],float id1[],float id2[],double id3);
  public void Perpendiculars(float id0[],float id1[],float id2[],double id3)
  {
    Perpendiculars_42(id0,id1,id2,id3);
  }

  private native boolean ProjectVector_43(float id0[],float id1[],float id2[]);
  public boolean ProjectVector(float id0[],float id1[],float id2[])
  {
    return ProjectVector_43(id0,id1,id2);
  }

  private native boolean ProjectVector_44(double id0[],double id1[],double id2[]);
  public boolean ProjectVector(double id0[],double id1[],double id2[])
  {
    return ProjectVector_44(id0,id1,id2);
  }

  private native boolean ProjectVector2D_45(float id0[],float id1[],float id2[]);
  public boolean ProjectVector2D(float id0[],float id1[],float id2[])
  {
    return ProjectVector2D_45(id0,id1,id2);
  }

  private native boolean ProjectVector2D_46(double id0[],double id1[],double id2[]);
  public boolean ProjectVector2D(double id0[],double id1[],double id2[])
  {
    return ProjectVector2D_46(id0,id1,id2);
  }

  private native float Distance2BetweenPoints_47(float id0[],float id1[]);
  public float Distance2BetweenPoints(float id0[],float id1[])
  {
    return Distance2BetweenPoints_47(id0,id1);
  }

  private native double Distance2BetweenPoints_48(double id0[],double id1[]);
  public double Distance2BetweenPoints(double id0[],double id1[])
  {
    return Distance2BetweenPoints_48(id0,id1);
  }

  private native double AngleBetweenVectors_49(double id0[],double id1[]);
  public double AngleBetweenVectors(double id0[],double id1[])
  {
    return AngleBetweenVectors_49(id0,id1);
  }

  private native double SignedAngleBetweenVectors_50(double id0[],double id1[],double id2[]);
  public double SignedAngleBetweenVectors(double id0[],double id1[],double id2[])
  {
    return SignedAngleBetweenVectors_50(id0,id1,id2);
  }

  private native double GaussianAmplitude_51(double id0,double id1);
  public double GaussianAmplitude(double id0,double id1)
  {
    return GaussianAmplitude_51(id0,id1);
  }

  private native double GaussianAmplitude_52(double id0,double id1,double id2);
  public double GaussianAmplitude(double id0,double id1,double id2)
  {
    return GaussianAmplitude_52(id0,id1,id2);
  }

  private native double GaussianWeight_53(double id0,double id1);
  public double GaussianWeight(double id0,double id1)
  {
    return GaussianWeight_53(id0,id1);
  }

  private native double GaussianWeight_54(double id0,double id1,double id2);
  public double GaussianWeight(double id0,double id1,double id2)
  {
    return GaussianWeight_54(id0,id1,id2);
  }

  private native float Dot2D_55(float id0[],float id1[]);
  public float Dot2D(float id0[],float id1[])
  {
    return Dot2D_55(id0,id1);
  }

  private native double Dot2D_56(double id0[],double id1[]);
  public double Dot2D(double id0[],double id1[])
  {
    return Dot2D_56(id0,id1);
  }

  private native float Norm2D_57(float id0[]);
  public float Norm2D(float id0[])
  {
    return Norm2D_57(id0);
  }

  private native double Norm2D_58(double id0[]);
  public double Norm2D(double id0[])
  {
    return Norm2D_58(id0);
  }

  private native float Normalize2D_59(float id0[]);
  public float Normalize2D(float id0[])
  {
    return Normalize2D_59(id0);
  }

  private native double Normalize2D_60(double id0[]);
  public double Normalize2D(double id0[])
  {
    return Normalize2D_60(id0);
  }

  private native float Determinant2x2_61(float id0[],float id1[]);
  public float Determinant2x2(float id0[],float id1[])
  {
    return Determinant2x2_61(id0,id1);
  }

  private native double Determinant2x2_62(double id0,double id1,double id2,double id3);
  public double Determinant2x2(double id0,double id1,double id2,double id3)
  {
    return Determinant2x2_62(id0,id1,id2,id3);
  }

  private native double Determinant2x2_63(double id0[],double id1[]);
  public double Determinant2x2(double id0[],double id1[])
  {
    return Determinant2x2_63(id0,id1);
  }

  private native float Determinant3x3_64(float id0[],float id1[],float id2[]);
  public float Determinant3x3(float id0[],float id1[],float id2[])
  {
    return Determinant3x3_64(id0,id1,id2);
  }

  private native double Determinant3x3_65(double id0[],double id1[],double id2[]);
  public double Determinant3x3(double id0[],double id1[],double id2[])
  {
    return Determinant3x3_65(id0,id1,id2);
  }

  private native double Determinant3x3_66(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8);
  public double Determinant3x3(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8)
  {
    return Determinant3x3_66(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void MultiplyQuaternion_67(float id0[],float id1[],float id2[]);
  public void MultiplyQuaternion(float id0[],float id1[],float id2[])
  {
    MultiplyQuaternion_67(id0,id1,id2);
  }

  private native void MultiplyQuaternion_68(double id0[],double id1[],double id2[]);
  public void MultiplyQuaternion(double id0[],double id1[],double id2[])
  {
    MultiplyQuaternion_68(id0,id1,id2);
  }

  private native void RotateVectorByNormalizedQuaternion_69(float id0[],float id1[],float id2[]);
  public void RotateVectorByNormalizedQuaternion(float id0[],float id1[],float id2[])
  {
    RotateVectorByNormalizedQuaternion_69(id0,id1,id2);
  }

  private native void RotateVectorByNormalizedQuaternion_70(double id0[],double id1[],double id2[]);
  public void RotateVectorByNormalizedQuaternion(double id0[],double id1[],double id2[])
  {
    RotateVectorByNormalizedQuaternion_70(id0,id1,id2);
  }

  private native void RotateVectorByWXYZ_71(float id0[],float id1[],float id2[]);
  public void RotateVectorByWXYZ(float id0[],float id1[],float id2[])
  {
    RotateVectorByWXYZ_71(id0,id1,id2);
  }

  private native void RotateVectorByWXYZ_72(double id0[],double id1[],double id2[]);
  public void RotateVectorByWXYZ(double id0[],double id1[],double id2[])
  {
    RotateVectorByWXYZ_72(id0,id1,id2);
  }

  private native void RGBToHSV_73(float id0[],float id1[]);
  public void RGBToHSV(float id0[],float id1[])
  {
    RGBToHSV_73(id0,id1);
  }

  private native void RGBToHSV_74(double id0[],double id1[]);
  public void RGBToHSV(double id0[],double id1[])
  {
    RGBToHSV_74(id0,id1);
  }

  private native void HSVToRGB_75(float id0[],float id1[]);
  public void HSVToRGB(float id0[],float id1[])
  {
    HSVToRGB_75(id0,id1);
  }

  private native void HSVToRGB_76(double id0[],double id1[]);
  public void HSVToRGB(double id0[],double id1[])
  {
    HSVToRGB_76(id0,id1);
  }

  private native void LabToXYZ_77(double id0[],double id1[]);
  public void LabToXYZ(double id0[],double id1[])
  {
    LabToXYZ_77(id0,id1);
  }

  private native void XYZToLab_78(double id0[],double id1[]);
  public void XYZToLab(double id0[],double id1[])
  {
    XYZToLab_78(id0,id1);
  }

  private native void XYZToRGB_79(double id0[],double id1[]);
  public void XYZToRGB(double id0[],double id1[])
  {
    XYZToRGB_79(id0,id1);
  }

  private native void RGBToXYZ_80(double id0[],double id1[]);
  public void RGBToXYZ(double id0[],double id1[])
  {
    RGBToXYZ_80(id0,id1);
  }

  private native void RGBToLab_81(double id0[],double id1[]);
  public void RGBToLab(double id0[],double id1[])
  {
    RGBToLab_81(id0,id1);
  }

  private native void LabToRGB_82(double id0[],double id1[]);
  public void LabToRGB(double id0[],double id1[])
  {
    LabToRGB_82(id0,id1);
  }

  private native void UninitializeBounds_83(double id0[]);
  public void UninitializeBounds(double id0[])
  {
    UninitializeBounds_83(id0);
  }

  private native int AreBoundsInitialized_84(double id0[]);
  public int AreBoundsInitialized(double id0[])
  {
    return AreBoundsInitialized_84(id0);
  }

  private native double ClampAndNormalizeValue_85(double id0,double id1[]);
  public double ClampAndNormalizeValue(double id0,double id1[])
  {
    return ClampAndNormalizeValue_85(id0,id1);
  }

  private native int GetScalarTypeFittingRange_86(double id0,double id1,double id2,double id3);
  public int GetScalarTypeFittingRange(double id0,double id1,double id2,double id3)
  {
    return GetScalarTypeFittingRange_86(id0,id1,id2,id3);
  }

  private native int GetAdjustedScalarRange_87(vtkDataArray id0,int id1,double id2[]);
  public int GetAdjustedScalarRange(vtkDataArray id0,int id1,double id2[])
  {
    return GetAdjustedScalarRange_87(id0,id1,id2);
  }

  private native int ExtentIsWithinOtherExtent_88(int id0[],int id1[]);
  public int ExtentIsWithinOtherExtent(int id0[],int id1[])
  {
    return ExtentIsWithinOtherExtent_88(id0,id1);
  }

  private native int BoundsIsWithinOtherBounds_89(double id0[],double id1[],double id2[]);
  public int BoundsIsWithinOtherBounds(double id0[],double id1[],double id2[])
  {
    return BoundsIsWithinOtherBounds_89(id0,id1,id2);
  }

  private native int PointIsWithinBounds_90(double id0[],double id1[],double id2[]);
  public int PointIsWithinBounds(double id0[],double id1[],double id2[])
  {
    return PointIsWithinBounds_90(id0,id1,id2);
  }

  private native int PlaneIntersectsAABB_91(double id0[],double id1[],double id2[]);
  public int PlaneIntersectsAABB(double id0[],double id1[],double id2[])
  {
    return PlaneIntersectsAABB_91(id0,id1,id2);
  }

  private native double Solve3PointCircle_92(double id0[],double id1[],double id2[],double id3[]);
  public double Solve3PointCircle(double id0[],double id1[],double id2[],double id3[])
  {
    return Solve3PointCircle_92(id0,id1,id2,id3);
  }

  private native double Inf_93();
  public double Inf()
  {
    return Inf_93();
  }

  private native double NegInf_94();
  public double NegInf()
  {
    return NegInf_94();
  }

  private native double Nan_95();
  public double Nan()
  {
    return Nan_95();
  }

  private native int IsInf_96(double id0);
  public int IsInf(double id0)
  {
    return IsInf_96(id0);
  }

  private native int IsNan_97(double id0);
  public int IsNan(double id0)
  {
    return IsNan_97(id0);
  }

  private native boolean IsFinite_98(double id0);
  public boolean IsFinite(double id0)
  {
    return IsFinite_98(id0);
  }

  private native long ComputeGCD_99(long id0,long id1);
  public long ComputeGCD(long id0,long id1)
  {
    return ComputeGCD_99(id0,id1);
  }

  private native void GetPointAlongLine_100(double id0[],double id1[],double id2[],double id3);
  public void GetPointAlongLine(double id0[],double id1[],double id2[],double id3)
  {
    GetPointAlongLine_100(id0,id1,id2,id3);
  }

  public vtkMath() { super(); }

  public vtkMath(long id) { super(id); }
  public native long   VTKInit();

}
