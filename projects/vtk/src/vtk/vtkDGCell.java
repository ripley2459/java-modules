// java wrapper for vtkDGCell object
//

package vtk;
import java.nio.charset.StandardCharsets;


public class vtkDGCell extends vtkCellMetadata
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

  private native long GetNumberOfCells_4();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_4();
  }

  private native void ShallowCopy_5(vtkCellMetadata id0);
  public void ShallowCopy(vtkCellMetadata id0)
  {
    ShallowCopy_5(id0);
  }

  private native void DeepCopy_6(vtkCellMetadata id0);
  public void DeepCopy(vtkCellMetadata id0)
  {
    DeepCopy_6(id0);
  }

  private native int GetShapeCornerCount_7(int id0);
  public int GetShapeCornerCount(int id0)
  {
    return GetShapeCornerCount_7(id0);
  }

  private native int GetShapeDimension_8(int id0);
  public int GetShapeDimension(int id0)
  {
    return GetShapeDimension_8(id0);
  }

  private native int GetShape_9();
  public int GetShape()
  {
    return GetShape_9();
  }

  private native int GetDimension_10();
  public int GetDimension()
  {
    return GetDimension_10();
  }

  private native int GetNumberOfCorners_11();
  public int GetNumberOfCorners()
  {
    return GetNumberOfCorners_11();
  }

  private native int GetNumberOfSideTypes_12();
  public int GetNumberOfSideTypes()
  {
    return GetNumberOfSideTypes_12();
  }

  private native int[] GetSideRangeForSideType_13(int id0);
  public int[] GetSideRangeForSideType(int id0)
  {
    return GetSideRangeForSideType_13(id0);
  }

  private native int GetNumberOfSidesOfDimension_14(int id0);
  public int GetNumberOfSidesOfDimension(int id0)
  {
    return GetNumberOfSidesOfDimension_14(id0);
  }

  private native int GetSideShape_15(int id0);
  public int GetSideShape(int id0)
  {
    return GetSideShape_15(id0);
  }

  private native int GetSideTypeForShape_16(int id0);
  public int GetSideTypeForShape(int id0)
  {
    return GetSideTypeForShape_16(id0);
  }

  private native long GetReferencePoints_17();
  public vtkTypeFloat32Array GetReferencePoints()
  {
    long temp = GetReferencePoints_17();

    if (temp == 0) return null;
    return (vtkTypeFloat32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideConnectivity_18();
  public vtkTypeInt32Array GetSideConnectivity()
  {
    long temp = GetSideConnectivity_18();

    if (temp == 0) return null;
    return (vtkTypeInt32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideOffsetsAndShapes_19();
  public vtkTypeInt32Array GetSideOffsetsAndShapes()
  {
    long temp = GetSideOffsetsAndShapes_19();

    if (temp == 0) return null;
    return (vtkTypeInt32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void FillReferencePoints_20(vtkTypeFloat32Array id0);
  public void FillReferencePoints(vtkTypeFloat32Array id0)
  {
    FillReferencePoints_20(id0);
  }

  private native void FillSideConnectivity_21(vtkTypeInt32Array id0);
  public void FillSideConnectivity(vtkTypeInt32Array id0)
  {
    FillSideConnectivity_21(id0);
  }

  private native void FillSideOffsetsAndShapes_22(vtkTypeInt32Array id0);
  public void FillSideOffsetsAndShapes(vtkTypeInt32Array id0)
  {
    FillSideOffsetsAndShapes_22(id0);
  }

  public vtkDGCell() { super(); }

  public vtkDGCell(long id) { super(id); }

}
