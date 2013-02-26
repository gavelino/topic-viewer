package br.ufmg.aserg.topicviewer.control.extraction;

import java.io.File;
import java.util.LinkedList;

import org.splabs.vocabulary.vxl.VocabularyExtractor;
import org.splabs.vocabulary.vxl.vloccount.LOCParameters;

import br.ufmg.aserg.topicviewer.control.AbstractController;
import br.ufmg.aserg.topicviewer.util.Properties;

public class VocabularyExtractionController extends AbstractController {
	
	private VocabularyExtractor extractor;
	private File[] projects;
	
	public VocabularyExtractionController(File[] projects) {
		super();
		
		this.projects = projects;
		this.setAllProjectCount(this.projects.length);
		
		this.resultFolderName = Properties.getProperty(Properties.WORKSPACE) + File.separator + Properties.VOCABULARY_OUTPUT;
		checkResultFolder();
	}
	
	@Override
	public void run() {
		for (File project : this.projects) {
			try {
				String projectName = project.getName();
				
				this.extractor = new VocabularyExtractor(projectName, "");
				this.extractor.extractTermsFromJavaFolder(project.getAbsolutePath(),
						this.resultFolderName + File.separator + projectName + ".vxl", "", new LinkedList<LOCParameters>());
				
			} catch (Exception e) {
				this.failedProjects.add(project);
			}
			
			this.addAnalyzedProject();
		}
	}
}