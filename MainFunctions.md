The first activity available for a user, as he starts this tool, is configuring a workspace, i.e. a folder which any output data will be stored.

All remaining available tasks in `TopicViewer` are divided as _Extraction_ and _Displaying_. The _Extraction_ tasks include **Text Extraction** from Java source code, resulting in a term-document matrix (two files with extensions .matrix and .ids), along with a .vocabulary file containing information about text and structure of one system.

The second _Extraction_ process is **Semantic Clustering**, which groups similar classes and extracts a set of frequent terms from these groups. This process will generate four files: a correlation matrix (.cmatrix) with similarities between all classes, pairwise; an .ids file with all class names; a .clusters file with the clustering output (all groups of classes); and finally a text file displaying the frequent words -or semantic topics- from all groups generated, in a .topics file. For visualization purposes, no file can be deleted, as every information saved in files are important for analysis.

Finally, the _Displaying_ tasks include two kinds of visualization: the **Correlation Matrix View** allows the user to view how the classes of a system are similar to each other. The visualization is a simple matrix in which darker colors represent higher cosine similarities between two class vocabularies. On the other hand, the **Distribution Map View** shows the system's package organization in boxes, and each class is represented in a color referencing the group to which it was assigned. In this visualization, quality metric values can be viewed as well, in a tooltip soon as a entity is selected. Both visualization can be saved in a PNG file with the right click of the mouse.