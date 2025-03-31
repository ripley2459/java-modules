// java wrapper for vtkImageData object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkImageData extends vtkDataSet
{

  private native long ExtendedNew_0();
  public vtkImageData ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsTypeOf_1(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_1(bytes0, bytes0.length);
  }

  private native int IsA_2(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_3(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_4(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_4(bytes0, bytes0.length);
  }

  private native void CopyStructure_5(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_5(id0);
  }

  private native int GetDataObjectType_6();
  public int GetDataObjectType()
  {
    return GetDataObjectType_6();
  }

  private native long GetNumberOfCells_7();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_7();
  }

  private native long GetNumberOfPoints_8();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_8();
  }

  private native double[] GetPoint_9(long id0);
  public double[] GetPoint(long id0)
  {
    return GetPoint_9(id0);
  }

  private native void GetPoint_10(long id0,double id1[]);
  public void GetPoint(long id0,double id1[])
  {
    GetPoint_10(id0,id1);
  }

  private native long GetCell_11(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_11(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_12(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_12(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_13(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_13(id0,id1);
  }

  private native void GetCellBounds_14(long id0,double id1[]);
  public void GetCellBounds(long id0,double id1[])
  {
    GetCellBounds_14(id0,id1);
  }

  private native long FindPoint_15(double id0,double id1,double id2);
  public long FindPoint(double id0,double id1,double id2)
  {
    return FindPoint_15(id0,id1,id2);
  }

  private native long FindPoint_16(double id0[]);
  public long FindPoint(double id0[])
  {
    return FindPoint_16(id0);
  }

  private native int GetCellType_17(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_17(id0);
  }

  private native long GetCellSize_18(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_18(id0);
  }

  private native void GetCellPoints_19(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_19(id0,id1);
  }

  private native void GetPointCells_20(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_20(id0,id1);
  }

  private native void ComputeBounds_21();
  public void ComputeBounds()
  {
    ComputeBounds_21();
  }

  private native int GetMaxCellSize_22();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_22();
  }

  private native int GetMaxSpatialDimension_23();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_23();
  }

  private native void GetCellNeighbors_24(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_24(id0,id1,id2);
  }

  private native void Initialize_25();
  public void Initialize()
  {
    Initialize_25();
  }

  private native byte IsPointVisible_26(long id0);
  public byte IsPointVisible(long id0)
  {
    return IsPointVisible_26(id0);
  }

  private native byte IsCellVisible_27(long id0);
  public byte IsCellVisible(long id0)
  {
    return IsCellVisible_27(id0);
  }

  private native boolean HasAnyBlankPoints_28();
  public boolean HasAnyBlankPoints()
  {
    return HasAnyBlankPoints_28();
  }

  private native boolean HasAnyBlankCells_29();
  public boolean HasAnyBlankCells()
  {
    return HasAnyBlankCells_29();
  }

  private native void GetCellDims_30(int id0[]);
  public void GetCellDims(int id0[])
  {
    GetCellDims_30(id0);
  }

  private native void SetDimensions_31(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_31(id0,id1,id2);
  }

  private native void SetDimensions_32(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_32(id0);
  }

  private native int[] GetDimensions_33();
  public int[] GetDimensions()
  {
    return GetDimensions_33();
  }

  private native void GetDimensions_34(int id0[]);
  public void GetDimensions(int id0[])
  {
    GetDimensions_34(id0);
  }

  private native void GetDimensions_35(long id0[]);
  public void GetDimensions(long id0[])
  {
    GetDimensions_35(id0);
  }

  private native int ComputeStructuredCoordinates_36(double id0[],int id1[],double id2[]);
  public int ComputeStructuredCoordinates(double id0[],int id1[],double id2[])
  {
    return ComputeStructuredCoordinates_36(id0,id1,id2);
  }

  private native void GetVoxelGradient_37(int id0,int id1,int id2,vtkDataArray id3,vtkDataArray id4);
  public void GetVoxelGradient(int id0,int id1,int id2,vtkDataArray id3,vtkDataArray id4)
  {
    GetVoxelGradient_37(id0,id1,id2,id3,id4);
  }

  private native void GetPointGradient_38(int id0,int id1,int id2,vtkDataArray id3,double id4[]);
  public void GetPointGradient(int id0,int id1,int id2,vtkDataArray id3,double id4[])
  {
    GetPointGradient_38(id0,id1,id2,id3,id4);
  }

  private native int GetDataDimension_39();
  public int GetDataDimension()
  {
    return GetDataDimension_39();
  }

  private native long ComputePointId_40(int id0[]);
  public long ComputePointId(int id0[])
  {
    return ComputePointId_40(id0);
  }

  private native long ComputeCellId_41(int id0[]);
  public long ComputeCellId(int id0[])
  {
    return ComputeCellId_41(id0);
  }

  private native void SetExtent_42(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_42(id0);
  }

  private native void SetExtent_43(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_43(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetExtent_44();
  public int[] GetExtent()
  {
    return GetExtent_44();
  }

  private native double GetScalarTypeMin_45(vtkInformation id0);
  public double GetScalarTypeMin(vtkInformation id0)
  {
    return GetScalarTypeMin_45(id0);
  }

  private native double GetScalarTypeMin_46();
  public double GetScalarTypeMin()
  {
    return GetScalarTypeMin_46();
  }

  private native double GetScalarTypeMax_47(vtkInformation id0);
  public double GetScalarTypeMax(vtkInformation id0)
  {
    return GetScalarTypeMax_47(id0);
  }

  private native double GetScalarTypeMax_48();
  public double GetScalarTypeMax()
  {
    return GetScalarTypeMax_48();
  }

  private native int GetScalarSize_49(vtkInformation id0);
  public int GetScalarSize(vtkInformation id0)
  {
    return GetScalarSize_49(id0);
  }

  private native int GetScalarSize_50();
  public int GetScalarSize()
  {
    return GetScalarSize_50();
  }

  private native long[]  GetIncrements_51();
  public long[]  GetIncrements()
  {
    return GetIncrements_51();
  }

  private native void GetIncrements_52(long id0[]);
  public void GetIncrements(long id0[])
  {
    GetIncrements_52(id0);
  }

  private native long[]  GetIncrements_53(vtkDataArray id0);
  public long[]  GetIncrements(vtkDataArray id0)
  {
    return GetIncrements_53(id0);
  }

  private native void GetIncrements_54(vtkDataArray id0,long id1[]);
  public void GetIncrements(vtkDataArray id0,long id1[])
  {
    GetIncrements_54(id0,id1);
  }

  private native long GetScalarIndexForExtent_55(int id0[]);
  public long GetScalarIndexForExtent(int id0[])
  {
    return GetScalarIndexForExtent_55(id0);
  }

  private native long GetScalarIndex_56(int id0[]);
  public long GetScalarIndex(int id0[])
  {
    return GetScalarIndex_56(id0);
  }

  private native long GetScalarIndex_57(int id0,int id1,int id2);
  public long GetScalarIndex(int id0,int id1,int id2)
  {
    return GetScalarIndex_57(id0,id1,id2);
  }

  private native float GetScalarComponentAsFloat_58(int id0,int id1,int id2,int id3);
  public float GetScalarComponentAsFloat(int id0,int id1,int id2,int id3)
  {
    return GetScalarComponentAsFloat_58(id0,id1,id2,id3);
  }

  private native void SetScalarComponentFromFloat_59(int id0,int id1,int id2,int id3,float id4);
  public void SetScalarComponentFromFloat(int id0,int id1,int id2,int id3,float id4)
  {
    SetScalarComponentFromFloat_59(id0,id1,id2,id3,id4);
  }

  private native double GetScalarComponentAsDouble_60(int id0,int id1,int id2,int id3);
  public double GetScalarComponentAsDouble(int id0,int id1,int id2,int id3)
  {
    return GetScalarComponentAsDouble_60(id0,id1,id2,id3);
  }

  private native void SetScalarComponentFromDouble_61(int id0,int id1,int id2,int id3,double id4);
  public void SetScalarComponentFromDouble(int id0,int id1,int id2,int id3,double id4)
  {
    SetScalarComponentFromDouble_61(id0,id1,id2,id3,id4);
  }

  private native void AllocateScalars_62(int id0,int id1);
  public void AllocateScalars(int id0,int id1)
  {
    AllocateScalars_62(id0,id1);
  }

  private native void AllocateScalars_63(vtkInformation id0);
  public void AllocateScalars(vtkInformation id0)
  {
    AllocateScalars_63(id0);
  }

  private native void CopyAndCastFrom_64(vtkImageData id0,int id1[]);
  public void CopyAndCastFrom(vtkImageData id0,int id1[])
  {
    CopyAndCastFrom_64(id0,id1);
  }

  private native void CopyAndCastFrom_65(vtkImageData id0,int id1,int id2,int id3,int id4,int id5,int id6);
  public void CopyAndCastFrom(vtkImageData id0,int id1,int id2,int id3,int id4,int id5,int id6)
  {
    CopyAndCastFrom_65(id0,id1,id2,id3,id4,id5,id6);
  }

  private native long GetActualMemorySize_66();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_66();
  }

  private native double[] GetSpacing_67();
  public double[] GetSpacing()
  {
    return GetSpacing_67();
  }

  private native void SetSpacing_68(double id0,double id1,double id2);
  public void SetSpacing(double id0,double id1,double id2)
  {
    SetSpacing_68(id0,id1,id2);
  }

  private native void SetSpacing_69(double id0[]);
  public void SetSpacing(double id0[])
  {
    SetSpacing_69(id0);
  }

  private native double[] GetOrigin_70();
  public double[] GetOrigin()
  {
    return GetOrigin_70();
  }

  private native void SetOrigin_71(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_71(id0,id1,id2);
  }

  private native void SetOrigin_72(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_72(id0);
  }

  private native long GetDirectionMatrix_73();
  public vtkMatrix3x3 GetDirectionMatrix()
  {
    long temp = GetDirectionMatrix_73();

    if (temp == 0) return null;
    return (vtkMatrix3x3)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDirectionMatrix_74(vtkMatrix3x3 id0);
  public void SetDirectionMatrix(vtkMatrix3x3 id0)
  {
    SetDirectionMatrix_74(id0);
  }

  private native void SetDirectionMatrix_75(double id0[]);
  public void SetDirectionMatrix(double id0[])
  {
    SetDirectionMatrix_75(id0);
  }

  private native void SetDirectionMatrix_76(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8);
  public void SetDirectionMatrix(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8)
  {
    SetDirectionMatrix_76(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native long GetIndexToPhysicalMatrix_77();
  public vtkMatrix4x4 GetIndexToPhysicalMatrix()
  {
    long temp = GetIndexToPhysicalMatrix_77();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void TransformContinuousIndexToPhysicalPoint_78(double id0,double id1,double id2,double id3[]);
  public void TransformContinuousIndexToPhysicalPoint(double id0,double id1,double id2,double id3[])
  {
    TransformContinuousIndexToPhysicalPoint_78(id0,id1,id2,id3);
  }

  private native void TransformContinuousIndexToPhysicalPoint_79(double id0[],double id1[]);
  public void TransformContinuousIndexToPhysicalPoint(double id0[],double id1[])
  {
    TransformContinuousIndexToPhysicalPoint_79(id0,id1);
  }

  private native void TransformIndexToPhysicalPoint_80(int id0,int id1,int id2,double id3[]);
  public void TransformIndexToPhysicalPoint(int id0,int id1,int id2,double id3[])
  {
    TransformIndexToPhysicalPoint_80(id0,id1,id2,id3);
  }

  private native void TransformIndexToPhysicalPoint_81(int id0[],double id1[]);
  public void TransformIndexToPhysicalPoint(int id0[],double id1[])
  {
    TransformIndexToPhysicalPoint_81(id0,id1);
  }

  private native void TransformContinuousIndexToPhysicalPoint_82(double id0,double id1,double id2,double id3[],double id4[],double id5[],double id6[]);
  public void TransformContinuousIndexToPhysicalPoint(double id0,double id1,double id2,double id3[],double id4[],double id5[],double id6[])
  {
    TransformContinuousIndexToPhysicalPoint_82(id0,id1,id2,id3,id4,id5,id6);
  }

  private native long GetPhysicalToIndexMatrix_83();
  public vtkMatrix4x4 GetPhysicalToIndexMatrix()
  {
    long temp = GetPhysicalToIndexMatrix_83();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void TransformPhysicalPointToContinuousIndex_84(double id0,double id1,double id2,double id3[]);
  public void TransformPhysicalPointToContinuousIndex(double id0,double id1,double id2,double id3[])
  {
    TransformPhysicalPointToContinuousIndex_84(id0,id1,id2,id3);
  }

  private native void TransformPhysicalPointToContinuousIndex_85(double id0[],double id1[]);
  public void TransformPhysicalPointToContinuousIndex(double id0[],double id1[])
  {
    TransformPhysicalPointToContinuousIndex_85(id0,id1);
  }

  private native void ComputeIndexToPhysicalMatrix_86(double id0[],double id1[],double id2[],double id3[]);
  public void ComputeIndexToPhysicalMatrix(double id0[],double id1[],double id2[],double id3[])
  {
    ComputeIndexToPhysicalMatrix_86(id0,id1,id2,id3);
  }

  private native void TransformPhysicalNormalToContinuousIndex_87(double id0[],double id1[]);
  public void TransformPhysicalNormalToContinuousIndex(double id0[],double id1[])
  {
    TransformPhysicalNormalToContinuousIndex_87(id0,id1);
  }

  private native void TransformPhysicalPlaneToContinuousIndex_88(double id0[],double id1[]);
  public void TransformPhysicalPlaneToContinuousIndex(double id0[],double id1[])
  {
    TransformPhysicalPlaneToContinuousIndex_88(id0,id1);
  }

  private native void SetScalarType_89(int id0,vtkInformation id1);
  public void SetScalarType(int id0,vtkInformation id1)
  {
    SetScalarType_89(id0,id1);
  }

  private native int GetScalarType_90(vtkInformation id0);
  public int GetScalarType(vtkInformation id0)
  {
    return GetScalarType_90(id0);
  }

  private native boolean HasScalarType_91(vtkInformation id0);
  public boolean HasScalarType(vtkInformation id0)
  {
    return HasScalarType_91(id0);
  }

  private native int GetScalarType_92();
  public int GetScalarType()
  {
    return GetScalarType_92();
  }

  private native byte[] GetScalarTypeAsString_93();
  public String GetScalarTypeAsString()
  {
    return new String(GetScalarTypeAsString_93(), StandardCharsets.UTF_8);
  }

  private native void SetNumberOfScalarComponents_94(int id0,vtkInformation id1);
  public void SetNumberOfScalarComponents(int id0,vtkInformation id1)
  {
    SetNumberOfScalarComponents_94(id0,id1);
  }

  private native int GetNumberOfScalarComponents_95(vtkInformation id0);
  public int GetNumberOfScalarComponents(vtkInformation id0)
  {
    return GetNumberOfScalarComponents_95(id0);
  }

  private native boolean HasNumberOfScalarComponents_96(vtkInformation id0);
  public boolean HasNumberOfScalarComponents(vtkInformation id0)
  {
    return HasNumberOfScalarComponents_96(id0);
  }

  private native int GetNumberOfScalarComponents_97();
  public int GetNumberOfScalarComponents()
  {
    return GetNumberOfScalarComponents_97();
  }

  private native void CopyInformationFromPipeline_98(vtkInformation id0);
  public void CopyInformationFromPipeline(vtkInformation id0)
  {
    CopyInformationFromPipeline_98(id0);
  }

  private native void CopyInformationToPipeline_99(vtkInformation id0);
  public void CopyInformationToPipeline(vtkInformation id0)
  {
    CopyInformationToPipeline_99(id0);
  }

  private native void PrepareForNewData_100();
  public void PrepareForNewData()
  {
    PrepareForNewData_100();
  }

  private native void ShallowCopy_101(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_101(id0);
  }

  private native void DeepCopy_102(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_102(id0);
  }

  private native long GetTupleIndex_103(vtkDataArray id0,int id1[]);
  public long GetTupleIndex(vtkDataArray id0,int id1[])
  {
    return GetTupleIndex_103(id0,id1);
  }

  private native void GetArrayIncrements_104(vtkDataArray id0,long id1[]);
  public void GetArrayIncrements(vtkDataArray id0,long id1[])
  {
    GetArrayIncrements_104(id0,id1);
  }

  private native int GetExtentType_105();
  public int GetExtentType()
  {
    return GetExtentType_105();
  }

  private native long GetData_106(vtkInformation id0);
  public vtkImageData GetData(vtkInformation id0)
  {
    long temp = GetData_106(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_107(vtkInformationVector id0,int id1);
  public vtkImageData GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_107(id0,id1);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkImageData() { super(); }

  public vtkImageData(long id) { super(id); }
  public native long   VTKInit();

}
