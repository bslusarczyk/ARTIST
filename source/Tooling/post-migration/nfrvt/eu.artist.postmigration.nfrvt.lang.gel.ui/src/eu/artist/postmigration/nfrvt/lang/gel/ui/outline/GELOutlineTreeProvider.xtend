/*
* generated by Xtext
*/
package eu.artist.postmigration.nfrvt.lang.gel.ui.outline

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonFactory
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class GELOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	def protected _createChildren(DocumentRootNode parentNode, MigrationEvaluation modelElement) {
		createEStructuralFeatureNode(
			parentNode,
			modelElement,
			GelPackage.Literals.MIGRATION_EVALUATION__IMPORTS,
			ArtistCommonFactory.eINSTANCE.createImportURI._image,
			"Import Declarations",
			false
		)
		createEObjectNode(parentNode, modelElement);
	}
	
	def protected _createChildren(IOutlineNode parentNode, MigrationEvaluation modelElement) {
		createEStructuralFeatureNode(
			parentNode,
			modelElement,
			GelPackage.Literals.MIGRATION_EVALUATION__TRANSFORMATIONS,
			GelFactory.eINSTANCE.createTransformation._image,
			"Migration",
			false
		)
		createEStructuralFeatureNode(
			parentNode,
			modelElement,
			GelPackage.Literals.MIGRATION_EVALUATION__PROPERTY_EVALUATIONS,
			GelFactory.eINSTANCE.createAppliedQualitativePropertyEvaluation._image,
			"Applied Property Evaluations",
			false
		)
		createNode(parentNode, modelElement.evaluation)
	}
}
