// java wrapper for vtkIOSSReader object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkIOSSReader extends vtkReaderAlgorithm
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

  private native void AddFileName_4(byte[] id0, int len0);
  public void AddFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddFileName_4(bytes0, bytes0.length);
  }

  private native void ClearFileNames_5();
  public void ClearFileNames()
  {
    ClearFileNames_5();
  }

  private native byte[] GetFileName_6(int id0);
  public String GetFileName(int id0)
  {
    return new String(GetFileName_6(id0), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfFileNames_7();
  public int GetNumberOfFileNames()
  {
    return GetNumberOfFileNames_7();
  }

  private native void SetFileName_8(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_8(bytes0, bytes0.length);
  }

  private native void SetDatabaseTypeOverride_9(byte[] id0, int len0);
  public void SetDatabaseTypeOverride(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDatabaseTypeOverride_9(bytes0, bytes0.length);
  }

  private native byte[] GetDatabaseTypeOverride_10();
  public String GetDatabaseTypeOverride()
  {
    return new String(GetDatabaseTypeOverride_10(), StandardCharsets.UTF_8);
  }

  private native void SetDisplacementMagnitude_11(double id0);
  public void SetDisplacementMagnitude(double id0)
  {
    SetDisplacementMagnitude_11(id0);
  }

  private native double GetDisplacementMagnitude_12();
  public double GetDisplacementMagnitude()
  {
    return GetDisplacementMagnitude_12();
  }

  private native void SetGroupNumericVectorFieldComponents_13(boolean id0);
  public void SetGroupNumericVectorFieldComponents(boolean id0)
  {
    SetGroupNumericVectorFieldComponents_13(id0);
  }

  private native boolean GetGroupNumericVectorFieldComponents_14();
  public boolean GetGroupNumericVectorFieldComponents()
  {
    return GetGroupNumericVectorFieldComponents_14();
  }

  private native void SetFieldSuffixSeparator_15(byte[] id0, int len0);
  public void SetFieldSuffixSeparator(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFieldSuffixSeparator_15(bytes0, bytes0.length);
  }

  private native byte[] GetFieldSuffixSeparator_16();
  public String GetFieldSuffixSeparator()
  {
    return new String(GetFieldSuffixSeparator_16(), StandardCharsets.UTF_8);
  }

  private native void SetScanForRelatedFiles_17(boolean id0);
  public void SetScanForRelatedFiles(boolean id0)
  {
    SetScanForRelatedFiles_17(id0);
  }

  private native boolean GetScanForRelatedFiles_18();
  public boolean GetScanForRelatedFiles()
  {
    return GetScanForRelatedFiles_18();
  }

  private native void ScanForRelatedFilesOn_19();
  public void ScanForRelatedFilesOn()
  {
    ScanForRelatedFilesOn_19();
  }

  private native void ScanForRelatedFilesOff_20();
  public void ScanForRelatedFilesOff()
  {
    ScanForRelatedFilesOff_20();
  }

  private native void SetFileRange_21(int id0,int id1);
  public void SetFileRange(int id0,int id1)
  {
    SetFileRange_21(id0,id1);
  }

  private native void SetFileRange_22(int id0[]);
  public void SetFileRange(int id0[])
  {
    SetFileRange_22(id0);
  }

  private native int[] GetFileRange_23();
  public int[] GetFileRange()
  {
    return GetFileRange_23();
  }

  private native void SetFileStride_24(int id0);
  public void SetFileStride(int id0)
  {
    SetFileStride_24(id0);
  }

  private native int GetFileStrideMinValue_25();
  public int GetFileStrideMinValue()
  {
    return GetFileStrideMinValue_25();
  }

  private native int GetFileStrideMaxValue_26();
  public int GetFileStrideMaxValue()
  {
    return GetFileStrideMaxValue_26();
  }

  private native int GetFileStride_27();
  public int GetFileStride()
  {
    return GetFileStride_27();
  }

  private native void SetMergeExodusEntityBlocks_28(boolean id0);
  public void SetMergeExodusEntityBlocks(boolean id0)
  {
    SetMergeExodusEntityBlocks_28(id0);
  }

  private native boolean GetMergeExodusEntityBlocks_29();
  public boolean GetMergeExodusEntityBlocks()
  {
    return GetMergeExodusEntityBlocks_29();
  }

  private native void MergeExodusEntityBlocksOn_30();
  public void MergeExodusEntityBlocksOn()
  {
    MergeExodusEntityBlocksOn_30();
  }

  private native void MergeExodusEntityBlocksOff_31();
  public void MergeExodusEntityBlocksOff()
  {
    MergeExodusEntityBlocksOff_31();
  }

  private native void SetElementAndSideIds_32(boolean id0);
  public void SetElementAndSideIds(boolean id0)
  {
    SetElementAndSideIds_32(id0);
  }

  private native boolean GetElementAndSideIds_33();
  public boolean GetElementAndSideIds()
  {
    return GetElementAndSideIds_33();
  }

  private native void ElementAndSideIdsOn_34();
  public void ElementAndSideIdsOn()
  {
    ElementAndSideIdsOn_34();
  }

  private native void ElementAndSideIdsOff_35();
  public void ElementAndSideIdsOff()
  {
    ElementAndSideIdsOff_35();
  }

  private native void SetGenerateFileId_36(boolean id0);
  public void SetGenerateFileId(boolean id0)
  {
    SetGenerateFileId_36(id0);
  }

  private native boolean GetGenerateFileId_37();
  public boolean GetGenerateFileId()
  {
    return GetGenerateFileId_37();
  }

  private native void GenerateFileIdOn_38();
  public void GenerateFileIdOn()
  {
    GenerateFileIdOn_38();
  }

  private native void GenerateFileIdOff_39();
  public void GenerateFileIdOff()
  {
    GenerateFileIdOff_39();
  }

  private native void SetReadIds_40(boolean id0);
  public void SetReadIds(boolean id0)
  {
    SetReadIds_40(id0);
  }

  private native boolean GetReadIds_41();
  public boolean GetReadIds()
  {
    return GetReadIds_41();
  }

  private native void ReadIdsOn_42();
  public void ReadIdsOn()
  {
    ReadIdsOn_42();
  }

  private native void ReadIdsOff_43();
  public void ReadIdsOff()
  {
    ReadIdsOff_43();
  }

  private native void SetRemoveUnusedPoints_44(boolean id0);
  public void SetRemoveUnusedPoints(boolean id0)
  {
    SetRemoveUnusedPoints_44(id0);
  }

  private native boolean GetRemoveUnusedPoints_45();
  public boolean GetRemoveUnusedPoints()
  {
    return GetRemoveUnusedPoints_45();
  }

  private native void RemoveUnusedPointsOn_46();
  public void RemoveUnusedPointsOn()
  {
    RemoveUnusedPointsOn_46();
  }

  private native void RemoveUnusedPointsOff_47();
  public void RemoveUnusedPointsOff()
  {
    RemoveUnusedPointsOff_47();
  }

  private native void SetApplyDisplacements_48(boolean id0);
  public void SetApplyDisplacements(boolean id0)
  {
    SetApplyDisplacements_48(id0);
  }

  private native boolean GetApplyDisplacements_49();
  public boolean GetApplyDisplacements()
  {
    return GetApplyDisplacements_49();
  }

  private native void ApplyDisplacementsOn_50();
  public void ApplyDisplacementsOn()
  {
    ApplyDisplacementsOn_50();
  }

  private native void ApplyDisplacementsOff_51();
  public void ApplyDisplacementsOff()
  {
    ApplyDisplacementsOff_51();
  }

  private native void SetReadGlobalFields_52(boolean id0);
  public void SetReadGlobalFields(boolean id0)
  {
    SetReadGlobalFields_52(id0);
  }

  private native boolean GetReadGlobalFields_53();
  public boolean GetReadGlobalFields()
  {
    return GetReadGlobalFields_53();
  }

  private native void ReadGlobalFieldsOn_54();
  public void ReadGlobalFieldsOn()
  {
    ReadGlobalFieldsOn_54();
  }

  private native void ReadGlobalFieldsOff_55();
  public void ReadGlobalFieldsOff()
  {
    ReadGlobalFieldsOff_55();
  }

  private native void SetReadAllFilesToDetermineStructure_56(boolean id0);
  public void SetReadAllFilesToDetermineStructure(boolean id0)
  {
    SetReadAllFilesToDetermineStructure_56(id0);
  }

  private native boolean GetReadAllFilesToDetermineStructure_57();
  public boolean GetReadAllFilesToDetermineStructure()
  {
    return GetReadAllFilesToDetermineStructure_57();
  }

  private native void ReadAllFilesToDetermineStructureOn_58();
  public void ReadAllFilesToDetermineStructureOn()
  {
    ReadAllFilesToDetermineStructureOn_58();
  }

  private native void ReadAllFilesToDetermineStructureOff_59();
  public void ReadAllFilesToDetermineStructureOff()
  {
    ReadAllFilesToDetermineStructureOff_59();
  }

  private native void SetReadQAAndInformationRecords_60(boolean id0);
  public void SetReadQAAndInformationRecords(boolean id0)
  {
    SetReadQAAndInformationRecords_60(id0);
  }

  private native boolean GetReadQAAndInformationRecords_61();
  public boolean GetReadQAAndInformationRecords()
  {
    return GetReadQAAndInformationRecords_61();
  }

  private native void ReadQAAndInformationRecordsOn_62();
  public void ReadQAAndInformationRecordsOn()
  {
    ReadQAAndInformationRecordsOn_62();
  }

  private native void ReadQAAndInformationRecordsOff_63();
  public void ReadQAAndInformationRecordsOff()
  {
    ReadQAAndInformationRecordsOff_63();
  }

  private native void SetController_64(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_64(id0);
  }

  private native long GetController_65();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_65();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddProperty_66(byte[] id0, int len0,int id1);
  public void AddProperty(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddProperty_66(bytes0, bytes0.length,id1);
  }

  private native void AddProperty_67(byte[] id0, int len0,double id1);
  public void AddProperty(String id0,double id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddProperty_67(bytes0, bytes0.length,id1);
  }

  private native void AddProperty_68(byte[] id0, int len0,byte[] id1, int len1);
  public void AddProperty(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddProperty_68(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void RemoveProperty_69(byte[] id0, int len0);
  public void RemoveProperty(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveProperty_69(bytes0, bytes0.length);
  }

  private native void ClearProperties_70();
  public void ClearProperties()
  {
    ClearProperties_70();
  }

  private native boolean GetEntityTypeIsBlock_71(int id0);
  public boolean GetEntityTypeIsBlock(int id0)
  {
    return GetEntityTypeIsBlock_71(id0);
  }

  private native boolean GetEntityTypeIsSet_72(int id0);
  public boolean GetEntityTypeIsSet(int id0)
  {
    return GetEntityTypeIsSet_72(id0);
  }

  private native byte[] GetDataAssemblyNodeNameForEntityType_73(int id0);
  public String GetDataAssemblyNodeNameForEntityType(int id0)
  {
    return new String(GetDataAssemblyNodeNameForEntityType_73(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetMergedEntityNameForEntityType_74(int id0);
  public String GetMergedEntityNameForEntityType(int id0)
  {
    return new String(GetMergedEntityNameForEntityType_74(id0), StandardCharsets.UTF_8);
  }

  private native long GetEntitySelection_75(int id0);
  public vtkDataArraySelection GetEntitySelection(int id0)
  {
    long temp = GetEntitySelection_75(id0);

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeBlockSelection_76();
  public vtkDataArraySelection GetNodeBlockSelection()
  {
    long temp = GetNodeBlockSelection_76();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeBlockSelection_77();
  public vtkDataArraySelection GetEdgeBlockSelection()
  {
    long temp = GetEdgeBlockSelection_77();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceBlockSelection_78();
  public vtkDataArraySelection GetFaceBlockSelection()
  {
    long temp = GetFaceBlockSelection_78();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementBlockSelection_79();
  public vtkDataArraySelection GetElementBlockSelection()
  {
    long temp = GetElementBlockSelection_79();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredBlockSelection_80();
  public vtkDataArraySelection GetStructuredBlockSelection()
  {
    long temp = GetStructuredBlockSelection_80();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeSetSelection_81();
  public vtkDataArraySelection GetNodeSetSelection()
  {
    long temp = GetNodeSetSelection_81();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeSetSelection_82();
  public vtkDataArraySelection GetEdgeSetSelection()
  {
    long temp = GetEdgeSetSelection_82();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceSetSelection_83();
  public vtkDataArraySelection GetFaceSetSelection()
  {
    long temp = GetFaceSetSelection_83();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementSetSelection_84();
  public vtkDataArraySelection GetElementSetSelection()
  {
    long temp = GetElementSetSelection_84();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideSetSelection_85();
  public vtkDataArraySelection GetSideSetSelection()
  {
    long temp = GetSideSetSelection_85();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFieldSelection_86(int id0);
  public vtkDataArraySelection GetFieldSelection(int id0)
  {
    long temp = GetFieldSelection_86(id0);

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeBlockFieldSelection_87();
  public vtkDataArraySelection GetNodeBlockFieldSelection()
  {
    long temp = GetNodeBlockFieldSelection_87();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeBlockFieldSelection_88();
  public vtkDataArraySelection GetEdgeBlockFieldSelection()
  {
    long temp = GetEdgeBlockFieldSelection_88();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceBlockFieldSelection_89();
  public vtkDataArraySelection GetFaceBlockFieldSelection()
  {
    long temp = GetFaceBlockFieldSelection_89();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementBlockFieldSelection_90();
  public vtkDataArraySelection GetElementBlockFieldSelection()
  {
    long temp = GetElementBlockFieldSelection_90();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredBlockFieldSelection_91();
  public vtkDataArraySelection GetStructuredBlockFieldSelection()
  {
    long temp = GetStructuredBlockFieldSelection_91();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeSetFieldSelection_92();
  public vtkDataArraySelection GetNodeSetFieldSelection()
  {
    long temp = GetNodeSetFieldSelection_92();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeSetFieldSelection_93();
  public vtkDataArraySelection GetEdgeSetFieldSelection()
  {
    long temp = GetEdgeSetFieldSelection_93();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceSetFieldSelection_94();
  public vtkDataArraySelection GetFaceSetFieldSelection()
  {
    long temp = GetFaceSetFieldSelection_94();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementSetFieldSelection_95();
  public vtkDataArraySelection GetElementSetFieldSelection()
  {
    long temp = GetElementSetFieldSelection_95();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideSetFieldSelection_96();
  public vtkDataArraySelection GetSideSetFieldSelection()
  {
    long temp = GetSideSetFieldSelection_96();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RemoveAllEntitySelections_97();
  public void RemoveAllEntitySelections()
  {
    RemoveAllEntitySelections_97();
  }

  private native void RemoveAllFieldSelections_98();
  public void RemoveAllFieldSelections()
  {
    RemoveAllFieldSelections_98();
  }

  private native void RemoveAllSelections_99();
  public void RemoveAllSelections()
  {
    RemoveAllSelections_99();
  }

  private native long GetEntityIdMapAsString_100(int id0);
  public vtkStringArray GetEntityIdMapAsString(int id0)
  {
    long temp = GetEntityIdMapAsString_100(id0);

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeBlockIdMapAsString_101();
  public vtkStringArray GetNodeBlockIdMapAsString()
  {
    long temp = GetNodeBlockIdMapAsString_101();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeBlockIdMapAsString_102();
  public vtkStringArray GetEdgeBlockIdMapAsString()
  {
    long temp = GetEdgeBlockIdMapAsString_102();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceBlockIdMapAsString_103();
  public vtkStringArray GetFaceBlockIdMapAsString()
  {
    long temp = GetFaceBlockIdMapAsString_103();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementBlockIdMapAsString_104();
  public vtkStringArray GetElementBlockIdMapAsString()
  {
    long temp = GetElementBlockIdMapAsString_104();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredBlockIdMapAsString_105();
  public vtkStringArray GetStructuredBlockIdMapAsString()
  {
    long temp = GetStructuredBlockIdMapAsString_105();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeSetIdMapAsString_106();
  public vtkStringArray GetNodeSetIdMapAsString()
  {
    long temp = GetNodeSetIdMapAsString_106();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeSetIdMapAsString_107();
  public vtkStringArray GetEdgeSetIdMapAsString()
  {
    long temp = GetEdgeSetIdMapAsString_107();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceSetIdMapAsString_108();
  public vtkStringArray GetFaceSetIdMapAsString()
  {
    long temp = GetFaceSetIdMapAsString_108();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementSetIdMapAsString_109();
  public vtkStringArray GetElementSetIdMapAsString()
  {
    long temp = GetElementSetIdMapAsString_109();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideSetIdMapAsString_110();
  public vtkStringArray GetSideSetIdMapAsString()
  {
    long temp = GetSideSetIdMapAsString_110();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAssembly_111();
  public vtkDataAssembly GetAssembly()
  {
    long temp = GetAssembly_111();

    if (temp == 0) return null;
    return (vtkDataAssembly)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetAssemblyTag_112();
  public int GetAssemblyTag()
  {
    return GetAssemblyTag_112();
  }

  private native boolean AddSelector_113(byte[] id0, int len0);
  public boolean AddSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddSelector_113(bytes0, bytes0.length);
  }

  private native void ClearSelectors_114();
  public void ClearSelectors()
  {
    ClearSelectors_114();
  }

  private native void SetSelector_115(byte[] id0, int len0);
  public void SetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSelector_115(bytes0, bytes0.length);
  }

  private native int GetNumberOfSelectors_116();
  public int GetNumberOfSelectors()
  {
    return GetNumberOfSelectors_116();
  }

  private native byte[] GetSelector_117(int id0);
  public String GetSelector(int id0)
  {
    return new String(GetSelector_117(id0), StandardCharsets.UTF_8);
  }

  private native int ReadMetaData_118(vtkInformation id0);
  public int ReadMetaData(vtkInformation id0)
  {
    return ReadMetaData_118(id0);
  }

  private native int ReadMesh_119(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadMesh(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadMesh_119(id0,id1,id2,id3,id4);
  }

  private native int ReadPoints_120(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadPoints(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadPoints_120(id0,id1,id2,id3,id4);
  }

  private native int ReadArrays_121(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadArrays(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadArrays_121(id0,id1,id2,id3,id4);
  }

  private native long GetMTime_122();
  public long GetMTime()
  {
    return GetMTime_122();
  }

  private native boolean DoTestFilePatternMatching_123();
  public boolean DoTestFilePatternMatching()
  {
    return DoTestFilePatternMatching_123();
  }

  private native long ENTITY_ID_124();
  public vtkInformationIntegerKey ENTITY_ID()
  {
    long temp = ENTITY_ID_124();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkIOSSReader() { super(); }

  public vtkIOSSReader(long id) { super(id); }
  public native long   VTKInit();

}
