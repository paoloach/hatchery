package edu.umontreal.hatchery.roslaunch

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.xml.XmlAttributeValue
import edu.umontreal.hatchery.util.findFilesByRelativePath

class RosLaunchSourceFileReference : PsiReferenceBase<XmlAttributeValue> {
  constructor(element: XmlAttributeValue) : super(element, false)

  override fun resolve() = element.containingFile.containingDirectory
    .parentDirectory?.findSubdirectory("src")?.findFile(element.value)

  override fun getVariants() = arrayOf<String>()
}