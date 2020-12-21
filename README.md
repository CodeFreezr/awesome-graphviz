# Awesome GraphViz [![Awesome](https://awesome.re/badge.svg)](https://awesome.re)

A curated list of GraphViz related resources.  

![GraphViz](static/GraphvizLogo.png)

These are some representative internal and external resources.  

The list includes tools that complement Graphviz, such as graph generators, postprocessors and interactive viewers. Additional the most important internal resource are linked. It also includes higher level systems and web sites that rely on Graphviz as a visualization service. You can also find more Graphviz related projects and resources in the [more to find](#more-to-find) Section. Find the [attic.md](attic.md) for old stuff with broken links or changed content. 

You're welcome to add new stuff or report glitches. See [contributing.md](contributing.md) how to pull requests.  


## Table of Content
- [Awesome GraphViz ![Awesome](https://awesome.re)](#awesome-graphviz-img-srchttpsawesomerebadgesvg-altawesome)
  - [Table of Content](#table-of-content)
  - [Content](#content)
    - [Graphviz Distribution](#graphviz-distribution)
      - [Introductions](#introductions)
      - [Entities](#entities)
      - [Attributes](#attributes)
      - [Layout / Output](#layout--output)
      - [Tools](#tools)
      - [API](#api)
    - [Social Media](#social-media)
    - [Theory & Publications](#theory--publications)
      - [Graphviz Papers](#graphviz-papers)
      - [Graph Drawing](#graph-drawing)
      - [Information Visualization](#information-visualization)
    - [Graphical Interfaces](#graphical-interfaces)
      - [Web-Interface](#web-interface)
      - [Common Platforms](#common-platforms)
      - [Addons](#addons)
      - [.NET / C](#net--c)
      - [Mac OS](#mac-os)
      - [Java](#java)
      - [Other](#other)
    - [Language Bindings](#language-bindings)
      - [Libs for Node / JS / JQuery / D3](#libs-for-node--js--jquery--d3)
      - [Libs for Python](#libs-for-python)
      - [Libs for Django](#libs-for-django)
      - [Libs for Go](#libs-for-go)
      - [Libs for Java](#libs-for-java)
      - [Libs for C# and .NET](#libs-for-c-and-net)
      - [Libs for Perl](#libs-for-perl)
      - [Libs for PHP](#libs-for-php)
      - [Others](#others)
    - [CMS-Integration](#cms-integration)
      - [Confluence/Jira](#confluencejira)
      - [Wiki/Blog](#wikiblog)
    - [Docker Images](#docker-images)
    - [Generators and Translators](#generators-and-translators)
      - [Transform data sources and formats into Graphviz](#transform-data-sources-and-formats-into-graphviz)
      - [AI and Language Tools](#ai-and-language-tools)
      - [Network and Web Engineering Tools](#network-and-web-engineering-tools)
      - [Programming and Software Engineering Tools](#programming-and-software-engineering-tools)
        - [UML and Software-Design](#uml-and-software-design)
        - [Documentation](#documentation)
        - [Call Graphs](#call-graphs)
        - [Dependency](#dependency)
        - [Schema & Datastructure](#schema--datastructure)
        - [Theoretical Computer Science](#theoretical-computer-science)
        - [Others](#others-1)
      - [Bioinformatics and Cheminformatics](#bioinformatics-and-cheminformatics)
      - [Document preparation](#document-preparation)
      - [Linux Distributions](#linux-distributions)
    - [Package Search and Further Collections](#package-search-and-further-collections)
      - [Packages](#packages)
      - [More to find](#more-to-find)


## Content
### Graphviz Distribution
#### Introductions
- [Homepage](https://graphviz.org/) - The official Homepage.
- [sourcecode](https://gitlab.com/graphviz/graphviz/) - The master GIT Repository for graphviz.
- [About Graph Visualisation](https://www.graphviz.org/about/) - A Summary about Graph Visualisation.
- [Wikipedia-Graphviz](https://en.wikipedia.org/wiki/Graphviz) -  Wikipedia page about Graphviz.
- [Wikipedia-DOT](https://en.wikipedia.org/wiki/DOT_(graph_description_language)) -  Great starter into the DOT / GV Language.
- [Changelog](https://gitlab.com/graphviz/graphviz/blob/master/ChangeLog) - Changelog starting from March 13, 2000.
- [Wish List](https://graphviz.org/_pages/doc/todo.html) - Graphviz Wish List
- Translations
  - [Romanian](http://science.webhostinggeeks.com/graphviz-about-rm) 
  - [Russian](http://www.portablecomponentsforall.com/edu/graphviz-about-ru/) 
  - [Serbo-Croatian](http://science.webhostinggeeks.com/graficka-vizualizacija)
  - [Ukrainian](http://www.passadrugtestingforall.com/edu/graphviz-about-uk/)
  - [Portuguese](https://www.homeyou.com/~edu/graphviz)

#### Entities
- [Syntax](https://graphviz.org/_pages/doc/info/lang.html) - The DOT Language.
- [Node](https://graphviz.org/_pages/doc/info/shapes.html) - A node is the primary 1st class element in a graph.
- [Edge](https://graphviz.org/_pages/doc/info/arrows.html) - An edge connect two nodes.
- [Graph](http://graphs.grevian.org/example) - GraphViz Pocket Reference.
- [Cluster](https://graphviz.org/_pages/Gallery/directed/cluster.html) - Devides the graph.
- [Subgraph](https://stackoverflow.com/questions/2012036/graphviz-how-to-connect-subgraphs) - How to connect subgraphs.

#### Attributes
- [All in One](https://graphviz.org/_pages/doc/info/attrs.html) - All Attributes of all Entities in one page.
- [Colors](https://graphviz.org/_pages/doc/info/colors.html) - Overview of graphviz colornames.

#### Layout / Output
- [Output Formats](https://graphviz.org/_pages/doc/info/output.html) - Overview of all possible output formats.
- [Command-line Invocation](https://graphviz.org/_pages/doc/info/command.html) - All Graphviz programs have a similar invocation.
- [circo](https://linux.die.net/man/1/circo) - draws graphs using a circular layout.
- [dot](https://graphviz.org/_pages/pdf/dot.1.pdf) - draws directed graphs.
- [dotguide](http://www.graphviz.org/pdf/dotguide.pdf) - Drawing graphs with dot
- [fdp](https://linux.die.net/man/1/fdp) - draws undirected graphs using a 'spring' model
- [neato](https://graphviz.org/_pages/pdf/neatoguide.pdf) - draws undirected graphs using 'spring' models.
- [osage](https://graphviz.org/_pages/pdf/osage.1.pdf) - filter for drawing clustered graphs.
- [patchwork](https://graphviz.org/_pages/pdf/patchwork.1.pdf) - filter for drawing clustered graphs as treemaps.
- [sfdp](https://linux.die.net/man/1/sfdp) - filter for drawing large undirected graphs.
- [twopi](https://linux.die.net/man/1/twopi) - filter for radial layouts of graphs.

#### Tools
- GUI
  - [dotty](https://linux.die.net/man/1/dotty) - Customizable Graph Editor, see also [pdf](https://www.graphviz.org/pdf/dottyguide.pdf).
  - [gvedit](http://204.178.9.49/content/new-gvedit-released) - Simple graph editor and viewer, Release-Notes. See als [pdf](https://graphviz.org/_pages/pdf/gvedit.1.pdf).
  - [lefty](https://linux.die.net/man/1/lefty) - Programmable Graphics Editor, see also [pdf](https://graphviz.org/_pages/pdf/leftyguide.pdf).
  - [lneato](https://linux.die.net/man/1/lneato) - Editor on top of neato & lefty, see also [pdf](https://graphviz.org/_pages/pdf/lneato.1.pdf).
  - [smyrna](https://linux.die.net/man/1/smyrna) - Interactive graph viewer, see also [pdf](https://graphviz.org/_pages/pdf/smyrna.1.pdf).
  - [vimdot](https://www.mankier.com/1/vimdot) - Combined text editor and dot viewer, see also [pdf](https://graphviz.org/_pages/pdf/vimdot.1.pdf).

- Graph Analysis
  - [acyclic](https://www.mankier.com/1/acyclic) - Make directed graph acyclic, see also [pdf](https://graphviz.org/_pages/pdf/acyclic.1.pdf).
  - [bcomps](https://www.mankier.com/1/bcomps) - Biconnected components filter for graphs, see also [pdf](https://graphviz.org/_pages/pdf/bcomps.1.pdf).
  - [cluster](https://www.mankier.com/1/cluster) - Find clusters in a graph and augment the graph with this information, see also [pdf](https://graphviz.org/_pages/pdf/cluster.1.pdf).
  - [ccomps](https://www.mankier.com/1/ccomps) - Connected components filter for graphs, see also [pdf](https://graphviz.org/_pages/pdf/ccomps.1.pdf).
  - [diffimg](https://www.mankier.com/1/diffimg) - Calculates intersection between two images, see also [pdf](https://graphviz.org/_pages/pdf/diffimg.1.pdf).
  - [dijkstra](https://www.mankier.com/1/dijkstra) - Single-source distance filter, see also [pdf](https://graphviz.org/_pages/pdf/dijkstra.1.pdf).
  - [edgepaint](https://www.mankier.com/1/edgepaint) - Edge coloring to disambiguate crossing edges, see also [pdf](https://graphviz.org/_pages/pdf/edgepaint.1.pdf).
  - [gc](https://www.mankier.com/1/gc) - Count graph components, see also [pdf](https://graphviz.org/_pages/pdf/gc.1.pdf).
  - [gvcolor](https://www.mankier.com/1/gvcolor) - Flow colors through a ranked digraph, see also [pdf](https://graphviz.org/_pages/pdf/gvcolor.1.pdf).
  - [gvgen](https://www.mankier.com/1/gvgen) - Generate graphs, see also [pdf](https://graphviz.org/_pages/pdf/gvgen.1.pdf).
  - [gvmap](https://www.mankier.com/1/gvmap) - Find clusters and create a geographical map highlighting clusters, see also [pdf](https://graphviz.org/_pages/pdf/gvmap.1.pdf).
  - [gvpack](https://www.mankier.com/1/gvpack) - Merge and pack disjoint graphs, see also [pdf](https://graphviz.org/_pages/pdf/gvpack.1.pdf).
  - [gvpr](https://www.mankier.com/1/gvpr) - Graph pattern scanning and processing language, see also [pdf](https://graphviz.org/_pages/pdf/gvpr.1.pdf).
  - [mingle](https://www.mankier.com/1/mingle) - Fast edge bundling, see also [pdf](https://graphviz.org/_pages/pdf/mingle.1.pdf).
  - [nop](https://www.mankier.com/1/nop) - Pretty-print graph file, see also [pdf](https://graphviz.org/_pages/pdf/nop.1.pdf).
  - [sccmap](https://www.mankier.com/1/sccmap) - Extract strongly connected components of directed graphs, see also [pdf](https://graphviz.org/_pages/pdf/sccmap.1.pdf).
  - [tred](https://www.mankier.com/1/tred) - Transitive reduction filter for directed graphs, see also [pdf](https://graphviz.org/_pages/pdf/tred.1.pdf).
  - [unflatten](https://www.mankier.com/1/unflatten) - Adjust directed graphs to improve layout aspect ratio, see also [pdf](https://graphviz.org/_pages/pdf/unflatten.1.pdf).
  - [gvrank](https://github.com/aaronjarecki/gvrank) - External pageRank algorithm that uses graphviz files as input written in go.
    
- Converters
  - [mm2gv](https://www.mankier.com/1/mm2gv) - Matrix Market-DOT converters, see also [pdf](https://graphviz.org/_pages/pdf/mm2gv.1.pdf).
  - [gxl2gv](https://www.mankier.com/1/gxl2gv) - GXL-GV converters, see also [pdf](https://graphviz.org/_pages/pdf/gxl2gv.1.pdf).
  - [gml2gv](https://www.mankier.com/1/gml2gv) - GML-DOTconverters, see also [pdf](https://graphviz.org/_pages/pdf/gml2gv.1.pdf).
  - [graphml2gv](https://www.mankier.com/1/graphml2gv) - GRAPHML-DOT converter, see also [pdf](https://graphviz.org/_pages/pdf/graphml2gv.1.pdf).

#### API
- Language Bindings
  - C 
    - Libraries
      - [cdt](https://graphviz.org/_pages/pdf/cdt.3.pdf) - container data types.
      - [cgraph](https://graphviz.org/_pages/pdf/cgraph.pdf) - Cgraph Tutorial.
      - [gvc](https://graphviz.org/_pages/pdf/gvc.3.pdf) - Graphviz context library.
      - [pack](https://graphviz.org/_pages/pdf/pack.3.pdf) - support for connected components.
      - [pathplan](https://graphviz.org/_pages/pdf/pathplan.3.pdf) - ﬁnds and smooths shortest paths.
      - [xdot](https://graphviz.org/_pages/pdf/xdot.3.pdf) - parsing and deparsing of xdot operations.
    - Sample Programs
      - [demo.c](https://graphviz.org/_pages/dot.demo/demo.c)
      - [dot.c](https://graphviz.org/_pages/dot.demo/dot.c) 
      - [example.c](https://graphviz.org/_pages/dot.demo/example.c)
      - [simple.c](https://graphviz.org/_pages/dot.demo/simple.c)
      - [Makefile](https://graphviz.org/_pages/dot.demo/Makefile)
  - TCL/TK libraries
    - [gdtclft.3tcl](https://graphviz.org/_pages/pdf/gdtclft.3tcl.pdf) - render images in various bitmap formats (GD, GD2, GIF,JPEG, PNG, WBMP,XBM).
    - [tcldot.3tcl](https://graphviz.org/_pages/pdf/tcldot.3tcl.pdf) - graph manipulation in tcl.
    - [tkspline.3tk](https://graphviz.org/_pages/pdf/tkspline.3tk.pdf) - additional smoothing method for canvasitems.
  - [Guile](https://graphviz.org/_pages/pdf/gv.3guile.pdf) - graph manipulation in guile.
  - [Java](https://graphviz.org/_pages/pdf/gv.3java.pdf) - graph manipulation in java.
  - [Perl](https://graphviz.org/_pages/pdf/gv.3perl.pdf) - graph manipulation in perl.
  - [PHP](https://graphviz.org/_pages/pdf/gv.3php.pdf) - graph manipulation in php.
  - [Python](https://graphviz.org/_pages/pdf/gv.3python.pdf) - graph manipulation in python.
  - [Ruby](https://graphviz.org/_pages/pdf/gv.3ruby.pdf) - graph manipulation in ruby.
  - [TCL](https://graphviz.org/_pages/pdf/gv.3tcl.pdf) - graph manipulation in tcl.
- Misc
  - [Build Notes](https://graphviz.org/doc/build.html) - Information on Building the sourcecode.
  - [JSON - Schema](https://graphviz.org/_pages/doc/info/graphviz_json_schema.json) - Plain JSON representation of a graph encoding xdot attributes.
  - [JSON - Output](https://graphviz.org/_pages/doc/info/output.html#d:json) - Explanation of the JSON-Output.


### Social Media
- [@graphviz](https://twitter.com/Graphviz) - Official Twitter Account
- [reddit](https://www.reddit.com/r/graphviz/) - Subreddit for graphviz
- [StackOverflow](https://stackoverflow.com/questions/tagged/graphviz) - Questions tagged with [graphviz]
- [issues](https://gitlab.com/graphviz/graphviz/issues) - Issues on Gitlab
- [ubuntu-wiki (de)](https://wiki.ubuntuusers.de/Graphviz/) - German ubuntu graphviz wiki
- [instagram](https://www.instagram.com/explore/tags/graphviz/) - Find Graphviz Images on Instagram
- [flickr group](https://www.flickr.com/groups/graphviz/) - Flickr Group. Find Graphviz Images on [Flickr](https://www.flickr.com/photos/tags/graphviz/)
- [Youtube](https://www.youtube.com/results?search_query=graphviz) - Over 2500 findings on Youtube

### Theory & Publications
#### Graphviz Papers
- [Graphviz and Dynagraph - Static and Dynamic Graph Drawing Tools](https://graphviz.org/_pages/Documentation/EGKNW03.pdf) - condensed overview ([cite](http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.96.3776))  
- [An open graph visualization system and its applications to software engineering](https://graphviz.org/_pages/Documentation/GN99.pdf) - longer overview, preferred for citation ([cite](http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.106.5621))  
- [Graph Drawing by Stress Majorization](https://graphviz.org/_pages/Documentation/GKN04.pdf) - improved algorithm for neato ([cite](https://link.springer.com/chapter/10.1007%2F978-3-540-31843-9_25))  
- [Topological Fisheye Views for Visualizing Large Graphs](https://graphviz.org/_pages/Documentation/GKN04a.pdf) - topological-based distorted views for large graphs  
- [A method for drawing directed graphs](https://graphviz.org/_pages/Documentation/TSE93.pdf) - dot's algorithm (1993) ([cite](http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.3.8982))  
- [Efficient and high quality force-directed graph drawing](http://yifanhu.net/PUB/graph_draw.pdf) - sfdp's algorithm (2005)  
- [Improved Circular Layouts](https://graphviz.org/_pages/Documentation/GK06.pdf) - crossing reduction and edge bundling for circular layouts ([cite](https://link.springer.com/chapter/10.1007%2F978-3-540-70904-6_37))  
- [Efficient and High Quality Force-Directed Graph Drawing](https://graphviz.org/_pages/Documentation/Hu05.pdf) - the multiscale algorithm used in sfdp ([cite](http://www.mathematica-journal.com/issue/v10i1/graph_draw.html))  
- [Implementing a General-Purpose Edge Router](https://graphviz.org/_pages/Documentation/DGKN97.pdf) - edge routing in Graphviz ([cite](https://link.springer.com/chapter/10.1007%2F3-540-63938-1_68))  
- [Improved Force-Directed Layouts](https://graphviz.org/_pages/Documentation/GN98.pdf) - Voronoi-based node overlap removal ([cite](https://link.springer.com/chapter/10.1007%2F3-540-37623-2_28))  
- [GMap](https://graphviz.org/_pages/Documentation/GHK09.pdf) - Visualizing graphs and clusters as maps ([cite](http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.154.8753))  
- [Efficient Node Overlap Removal Using a Proximity Stress Model](https://graphviz.org/_pages/Documentation/GH10.pdf) - Prism node overlap removal ([cite](https://link.springer.com/chapter/10.1007%2F978-3-642-00219-9_20))  
- [On-line Hierarchical Graph Drawing](https://graphviz.org/_pages/Documentation/NW01.pdf) - dynadag algorithm  
- [DIG-COLA](http://web2.research.att.com/export/sites/att_labs/groups/infovis/res/legacy_papers/DBLP-conf-infovis-DwyerK05.pdf) - Directed Graph Layout through Constrained Energy Minimization by *Tim Dwyer* and *Yehuda Koren*.

#### Graph Drawing
- [Wikipedia](https://en.wikipedia.org/wiki/Graph_drawing) - drawing of a graph or network diagram is a pictorial representation of the vertices and edges of a graph.
- [graphdrawing.org](http://www.graphdrawing.org/index.html) - annual symposia, books, data, open problems and more  
- [Survey](http://users.monash.edu/~gfarr/research/GraphDrawing02-Mel.ppt) - Franz Brandenburg talk notes in Powerpoint
- [Marks et al](http://www.merl.com/publications/TR2001-49/) - note on history of graph drawing
- [David Eppstein's](http://www.ics.uci.edu/~eppstein/gina/gdraw.html) - Geometry in Action
- [Graph Drawing](https://www.amazon.com/Graph-Drawing-Algorithms-Visualization-Graphs/dp/0133016153) - Algorithms for the Visualization of Graphs by *Ioannis G. Tollis, Giuseppe Di Battista, Peter Eades, Roberto Tamassia*.
- [Graph Drawing Software (Mathematics and Visualization)](https://www.amazon.com/Graph-Drawing-Software-Mathematics-Visualization/dp/3540008810) by M. Junger, Petra Mutzel (Symposium on Graph Drawing 2001, Vienna).
- [Drawing Graphs](https://www.amazon.com/Drawing-Graphs-Methods-Lecture-Computer/dp/3540420622) - Methods and Models by *Michael Kaufmann, Dorothea Wagner*.
- [Handbook of Graph Drawing and Visualization](https://www.amazon.com/Handbook-Visualization-Discrete-Mathematics-Applications/dp/1584884126) Roberto Tamassia, ed. [(On-line version)](http://cs.brown.edu/~rt/gdhandbook/)
- [D3 Graph Theory](https://mrpandey.github.io/d3graphTheory/index.html) - Learn graph theory interactively by *Avinash Pandey*. 

#### Information Visualization
- [Infovis now](http://vis.computer.org) - Current IEEE Infovis Symposia.
- [Infovis past](https://www.infovis.org/) - Past IEEE Infovis Symposia.
- [FlowingData](http://flowingdata.com/) - FlowingData
- [York U. Gallery of Visualization](http://www.datavis.ca/gallery/index.php) (see also [Statistics and Statistical Graphics Resources](http://www.math.yorku.ca/SCS/StatResource.html)).  
- [Stanford University course bilbiography](http://graphics.stanford.edu/courses/cs348c-96-fall/resources.html)[Stanford University Data Journalism](http://datajournalism.stanford.edu/)  
 


### Graphical Interfaces
#### Web-Interface
- [Liviz.js](http://ushiroad.com/jsviz/) - DHTML-based interactive viewer for Graphviz *Satoshi Ueyama*.
- [AJAX viewer](https://ashitani.jp/gv/) written with Rico *T. Ashitani*.
- [webgraphviz](http://www.webgraphviz.com/) - WebGraphviz is Graphviz in the Browser.
- [Online Graphviz Generator](http://fiane.mooo.com:8080/graphviz/) - Simple Online Generator with Golang Server see [src](https://github.com/noselasd/gvweb).
- [GraphvizFiddle](https://stamm-wilbrandt.de/GraphvizFiddle/) - a dual-view Graphviz editor, see [blog](https://www.ibm.com/developerworks/community/blogs/HermannSW/entry/graphvizfiddle?lang=en) *Hermann Stamm-Wilbrandt*.
- [Canviz](http://www.ryandesign.com/canviz/) - an HTML5/Javascript canvas viewer (beta). *Ryan Schmidt*.
- [Graphviz.it](http://graphviz.it) - Online-Editor with all the standard examples, based on graph-viz-d3-js.
- [GraphvizOnline](http://dreampuf.github.io/GraphvizOnline/) - Online Editor with Syntax Higlighting.
- [viz-js](http://viz-js.com/) - Example Gui from the viz.js Library *Mike Daines*.
- [Edotor.net](https://edotor.net) - Fiddle-like editor with rich features like refactorings, code-fixes and preview by *Niklas Mollenhauer*.
- [Sketchviz](https://sketchviz.com/) - Interactive editor that renders DOT graphs with a hand-drawn look.

#### Common Platforms
- [Gephi](https://gephi.org/) - The Open Graph Viz Platform *Mathieu Bastian*
- [IdeaTree](https://www.ideatreelive.com/ideatree/) - Platform for concurrent, shared knowledge mapping
- [Observable](https://beta.observablehq.com/) - Common Map, Chart & Diagram creation with graphviz support
- [Bl.ock](https://bl.ocks.org/) - Common Mapp, Chart & Diagram creation with graphviz support
- [graphistry](https://www.graphistry.com/) - Investigate across event & log systems with the power of visual graph analytics.
- [KeyLines Toolkit](https://cambridge-intelligence.com/keylines/) - Network Visualization Software with VueJS Component *Cambridge Intelligence* @CambridgeIntel

#### Addons
- [Graphviz for vscode](https://marketplace.visualstudio.com/items?itemName=Stephanvs.dot) - Graphviz (dot) Syntax Highlight and snippets for Visual Studio Code *Stephanvs*
- [Graphviz Preview](https://marketplace.visualstudio.com/items?itemName=EFanZh.graphviz-preview) - Inline Preview inside vs code editor *EFanZh*
- [Eclipse Zest/DOT](http://wiki.eclipse.org/Zest/DOT) - an Eclipse Zest 2.0 component that can be used to render and edit DOT graphs *Fabian Steeg* 
- [Graphvizzer](https://graphvizzer.objectivetruth.ca/) - Graph instantly in your Slack-Chat channel. [src](https://github.com/ObjectiveTruth/Graphvizzer)

#### .NET / C#
- [Graphviz4Net](https://archive.codeplex.com/?p=graphviz4net) provides Windows Presentation Foundation (WPF) control that is capable of rendering graph layouts using Graphviz. *Štěpán Šindelář* 
- [Wigraf](https://github.com/kml/Wigraf) - a Windows graphviz frontend based on WinGraphviz and C# .NET. "Graf" is polish for "graph." *Kamil Lemański* 
- [PSGraph](https://github.com/KevinMarquette/PSGraph) - A set of utilities for working with Graphviz in Powershell *Kevin Marquette*

#### Mac OS
- [Instaviz](http://instaviz.com/) - Graph sketching for the iPhone using Graphviz libraries for rendering. *Glen Low* 
- [Pixelglows](http://www.pixelglow.com/graphviz/) Document-based GUI for Mac OS X (won a 2004 award from Apple) *Glen Low* 

#### Java
- [idot](https://code.google.com/archive/p/idot) - Incremental Graphviz viewer (Java ≥ 1.5)
- [Yoix](https://www.2uwebhosting.com/) - Scripting language implemented in Java with a data visualization module called YDAT that provides interactive display of GraphViz files (use -Txdot -y) *John Mocenigo*.
- [TINTFU](https://www.openhub.net/p/tintfu) - Java-based editor for .dot graph files. *Walter Stroebel*.
- [Graphviz Test Tool](https://sites.google.com/site/kuabus/programming-by-hu/graphviz-test-tool) - Java GUI front-end for Graphviz *Hansuli Anderegg *.

#### Other
- [prefuse](http://prefuse.org/) - Toolkit *Mikko Vinni*.
- [KGraphViewer](https://www.kde.org/applications/graphics/kgraphviewer/) - a KDE viewer for layouts generated by Graphviz tools. *Gaël de Chalendar* 
- [BioGrapher](http://www.bioquest.org/esteem/esteem_details.php?product_id=6509) Excel front-end (WinXP and Mac) for Graphviz that allows the user to specify graphs in a spreadsheet using adjacency matrix, node list or Newick notation (for phylogenetic trees) and visualize the layout generated by Graphviz as an Excel (vector graphics) picture object. *Rama Viswanathan* 
- [Leonhard](https://github.com/glejeune/Leonhard) - Simple viewer/editor for GraphViz, developed with MacRuby. (See the [demo](https://www.youtube.com/watch?v=nyfZVGlErTo&feature=youtu.be).) 
- [EasyGraphViz](http://wiki.cyze.jp/wiki.cgi/software?page=EasyGraphViz) - Japanese editor for Graphviz. *Nikolaos Kavvadias*
- [NodeViz](https://code.google.com/archive/p/nodeviz) - PHP framework for mapping relational data to highly styled Graphviz and displaying interactively in web clients *Greg Michalec and Skye Bender-deMoll* 
- [dottask](https://github.com/mattboehm/dottask) - A todo tracker that utilizes dot/clojurejscript based on viz.js, see [example](http://dottask.mattboehm.rocks/) *Matthew Boehm*.

### Language Bindings  
#### Libs for Node / JS / JQuery / D3
- [viz.js](https://github.com/mdaines/viz.js/) - This project builds Graphviz with Emscripten and provides a simple wrapper for using it in the browser.
- [d3-graphviz](https://github.com/magjac/d3-graphviz) - Renders SVG from graphs described in the DOT language using the Viz.js port of Graphviz and does animated transitions between graphs. *Magnus Jacobsson*
- [graph-viz-d3-js](https://github.com/mstefaniuk/graph-viz-d3-js) - Bower component graphviz-d3-renderer renders Graphviz source in the browser with d3.js
- [d3-dot-graph](https://github.com/gmamaladze/d3-dot-graph) - This module provides D3js compatible library to parse and load files in graphviz DOT (.dot) (graph description language) format.
- [jquery.graphviz.svg](https://github.com/mountainstorm/jquery.graphviz.svg/) - jQuery plugin to make Graphviz SVG output more interactive and easier to navigate. *Rich Cooper* 
- [node-graphviz](https://github.com/glejeune/node-graphviz) - Interface to the GraphViz graphing tool
- [jQuery.Graphviz](https://github.com/goinnn/jquery.graphviz) - a jQuery based interactive graph viewer for graphviz svg, see a live demo on [jsfiddle](http://jsfiddle.net/UdysN/) *Pablo Martín*.
- [ts-graphviz](https://github.com/ts-graphviz/ts-graphviz) - Simple Graphviz library for TypeScript.

#### Libs for Python
 - [Pydot](https://github.com/erocarrera/pydot) - a python interface to Graphviz (Windows comptible). 
 - [Python-Graph](https://github.com/pmatiello/python-graph) - A library for working with graphs in Python. 
 - [PyGraphviz](http://www.lanl.gov/errors/system-notification.php) - a python interface to Graphviz similar to NetworkX. 
 - [mfgraph](https://realmike.org/blog/) - C++ interface with native bindings for python *Michael Föetsch* 
 - [GvGen](https://github.com/stricaud/gvgen) - a python class to generate dot files *Sebastien Tricaud* 
 
#### Libs for Django
 - [django-graphviz](https://code.google.com/archive/p/django-graphviz) - a Django app using Graphviz. 
 - [DjangoGraphviz](https://code.djangoproject.com/wiki/DjangoGraphviz) - Converts Django models into Graphviz DOT files. 

#### Libs for Go  
 - [gographviz](https://github.com/awalterschulze/gographviz) - a Graphviz parser for go *Walter Schulze*. 
 - [tmc/dot](https://github.com/tmc/dot) - graphviz dot language support for Go 
 - [k8sp/graphviz](https://github.com/k8sp/graphviz) - graphviz is an HTTP server which calls GraphViz to visualize a specified .dot file.
 - [paetzke/godot](https://github.com/paetzke/godot) - Godot is a graphviz wrapper for Go.
 - [gonum](https://www.gonum.org/) - Package with Gonum Graph successor of graphism/dot
 - [timtadh/dot](https://github.com/timtadh/dot) - Stream parsing of the graphviz dot language for go. *Tim Henderson*
 - [graphviz_web](https://github.com/hythof/graphviz_web) - Draw graph image by graphviz on web. 
 - [Patrolavia/godot](https://github.com/Patrolavia/godot) - generating graphviz diagram with ease
 - [graphspace](https://github.com/sigmonsays/graphspace) - graphviz workspace incl. sql-db / wb-gui for making dot graphs
 - [graph](https://github.com/lpadukana/graph) - Graphviz as a service 
 - [dotgraph](https://github.com/windler/dotgraph) - Go package to create and render graphviz dot graphs 
 - [Online Graphviz Generator](https://github.com/noselasd/gvweb) - Type in Graphviz graph language and display the generated image.
 - [Graphviz as a Service](https://github.com/djmattyg007/graphviz-server) - a webserver that responds rendered graphs in PNG format.
 - [dot](https://github.com/emicklei/dot) - Little helper package in Go for the graphviz dot language.
 - [GoGraphviz](https://github.com/mzohreva/GoGraphviz) - GoGraphviz provides an easy-to-use API for visualizing graphs using Graphviz
 
#### Libs for Java
 - [JPGD](http://www.alexander-merz.com/graphviz/) - Java parser for Graphviz documents *Alexander Merz* 
 - [Java API](https://github.com/jabbalaci/graphviz-java-api) - Java solution by *Laszlo Szathmary* 
 - [graphviz4j](https://github.com/shevek/graphviz4j) - Java GraphViz graph builder and parser.

#### Libs for C# and .NET
 - [graphviznet](https://code.google.com/archive/p/graphviznet) 
 - [CodePlex QuickGraph](https://archive.codeplex.com/) 
 - [Tigris QuickGraph](http://quickgraph.tigris.org/source/browse/quickgraph/trunk/src/) 

#### Libs for Perl
- [Graphviz2](https://metacpan.org/release/GraphViz2) - Perl interface, supports new options *Ron Savage* 
- [GraphViz2::Marpa](https://metacpan.org/release/GraphViz2-Marpa) - Marpa-based parser for DOT files. *Ron Savage* 
- [A Perl interface to Graphviz](http://search.cpan.org/~lbrocard/GraphViz-2.02/lib/GraphViz.pm) *Leon Brocard* 
- [Tk::GraphViz](http://search.cpan.org/~jgs/Tk-GraphViz/) - Perl module for displaying graphs in a perl/TK canvas *Jeremy Slade* 
- [Graph-ReadWrite](http://search.cpan.org/~neilb/Graph-ReadWrite/) - Module that supports 'dot' syntax graphs *Neil Bowers* 
- [GraphViz::ISA](http://search.cpan.org/~marcel/GraphViz-ISA-1.100860/lib/GraphViz/ISA.pm) - Graph Perl packages' ISA runtime hierarchies *Marcel Grunauer* 
- [Graph::Easy](http://search.cpan.org/~tels/Graph-Easy/) Rectilinear graph drawing program compatible with Graphviz and written  
 
#### Libs for PHP
- [Image_Graphviz](http://pear.php.net/package/Image_GraphViz) - class in PHP by *Sebastian Bergmann* 
- [graphp.graphviz](https://github.com/graphp/graphviz) - GraphViz graph drawing for mathematical graph/network in PHP

#### Others 
- [Ruby-Graphviz](https://github.com/glejeune/Ruby-Graphviz/) - Ruby interface to Graphviz *Grégoire Lejeune* 
- [MatLab](http://de.mathworks.com/matlabcentral/fileexchange/4518?requestedDomain=true&nocookie=true) *Leon Peshkin* 
- [webdot](https://gitlab.com/graphviz/webdot) TCL *John Ellson*  
- [S-DOT](http://www.martin-loetzsch.de/S-DOT/) - Common Lisp interface to dot *also Martin Loetzsch*.
- [Rgraphviz](https://bioconductor.org/packages/release/bioc/html/Rgraphviz.html) - Support for using the Graphviz library within R. *Kasper Daniel Hansen et all*


### CMS-Integration 
#### Confluence/Jira 
- [Graphviz Diagrams for Confluence](https://marketplace.atlassian.com/plugins/com.atlassian.confluence.extra.graphviz/server/overview) - Generate and display graphs based on Graph Visualization Software (Graphviz) and the DOT language. *Bob Swift*
- [Graphviz Cloud](https://marketplace.atlassian.com/plugins/com.addteq.graphviz/cloud/overview) - Create and render Graphviz diagrams for Confluence Cloud *Addteq*
- [Digraph Macro](https://bobswift.atlassian.net/wiki/spaces/GVIZ/pages/30703811/Digraph+Macro) - The Digraph Macro creates directed graphs using the Graphviz language. *Bob Swift*
- [GraphViz/PlantUML](https://avono-support.atlassian.net/wiki/spaces/PUML/overview) - Adding PlantUML Diagram in Confluence-Wiki with DOT-Language *Michael Griffel*

#### Wiki/Blog 
- [MediaWiki-1](http://search.cpan.org/~tels/mediawiki-graph/) - Extension *Tels*.
- [MediaWiki-2](https://www.mediawiki.org/wiki/Extension:GraphViz) - Extension *Coffman*.
- [Drupal](https://www.drupal.org/project/graphviz_filter) - Graphviz filter *Karim Ratib*.
- [Wordpress EHT Graphviz](https://ociotec.com/eht-graphviz-plugin-para-wordpress/) - Plugin for Wordpress, to allow Graphviz images to be easily integrated into a Wordpress page. *Emilio González Montaña*.
- [Wordpress Graphviz](https://wordpress.org/plugins/wp-graphviz/) - Plugin for Wordpres, to allow Graphviz images to be easily integrated into a Wordpress page. * - [DeBAAT](https://profiles.wordpress.org/debaat/)*.
- [DokuWiki](https://www.dokuwiki.org/plugin:graphviz) - Directed and non-directed graph images from “dot" language *Andreas Gohr*.
- [trac GraphvizPlugin](https://trac-hacks.org/wiki/GraphvizPlugin) - Dynamic generation of diagrams within wiki pages and ticket descriptions.

### Docker Images
- [omerio/graphviz-webapp](https://hub.docker.com/r/omerio/graphviz-webapp/) - Simple Java Web application deployed as a Docker container and run as part of a Kubernetes cluster by *Omer Dawelbeit* on [git](https://github.com/omerio/graphviz-webapp/).
- [omerio/graphviz-server](https://hub.docker.com/r/omerio/graphviz-server/) - HTTP server for Graphviz dot (ubuntu) by *Omer Dawelbeit*. More in this [blog-post](http://omerio.com/2013/11/03/running-a-graphviz-server-on-google-compute-engine/), src: [git](https://github.com/omerio/graphviz-server).
- [epicjhon/docker-php](https://hub.docker.com/r/epicjhon/docker-php/) - PHP images with more tools: Git, Memcached, Phalcon, Zend, pdo_mysql, mysqli, Runkit, Graphviz by *Jhon Eslava* on [git](https://github.com/EpicJhon/docker-php).
- [citizensadvice/ruby-jq](https://hub.docker.com/r/citizensadvice/ruby-jq/) - Ruby 2.3 with [jq](https://github.com/stedolan/jq) and graphviz on [git](https://github.com/citizensadvice/ruby-jq).
- [hamroctopus/graphviz](https://hub.docker.com/r/hamroctopus/graphviz/) - Docker container (ubuntu 14.04.4) providing graphviz-2.38.0 from *Eric Crosson* on [git](https://github.com/EricCrosson/graphviz).
- [efcasado/graphviz](https://hub.docker.com/r/efcasado/graphviz/) - Alpine Linux based, dockerized Graphviz by *Enrique Fernandez* on [git](https://github.com/efcasado/dockerfile-graphviz).
- [djmattyg007/graphviz-server](https://hub.docker.com/r/djmattyg007/graphviz-server/) - Graphviz as a Docker Service by *Matthew Gamble* on [git](https://github.com/djmattyg007/graphviz-server).
- [objectivetruth/graphvizzer](https://hub.docker.com/r/objectivetruth/graphvizzer/) - Docker image for the Graphvizzer slack-chat integrationon [git](https://github.com/ObjectiveTruth/Graphvizzer).
- [rahulsom/groovy-graphviz-jenkins-slave](https://hub.docker.com/r/rahulsom/groovy-graphviz-jenkins-slave/) - Creates a Jenkins Slave with groovy and graphviz by *Rahul Somasunderam* on [git](https://github.com/rahulsom/dockerfiles).
 
### Generators and Translators 
#### Transform data sources and formats into Graphviz 
- [ExcelToGraphviz1](https://sourceforge.net/projects/relationship-visualizer/) - Relationship Visualizer - Convert Excel data into Graphviz graphs *Jeff Long*.
- [ExcelToGraphviz2](https://sourceforge.net/projects/excel-to-graphviz/) - a tool for visualizing Excel data as graphs *Matt Castelli*.
- [Graph API](https://www.drupal.org/project/graphapi/) - a Drupal graph generation module with Graphviz Dot output capabilities. *Sebastian Daniel*.
- [WorldCat xISSN](http://www.worldcat.org/xissn/titlehistory) - shows the history of a journal indexed by ISSN *OCLC Online Computer Library Center, Inc.*.
- [Linguine Maps](http://www.softwaresecretweapons.com/lm_hibernate.html) - visualize XML DTDs, Apache Object Relational Bridge Files, Apache Ant Build files, and provide a clean Java API for diagramming *Pavel Simakov*.
- [PostgreSQL AutoDoc](https://github.com/cbbrowne/autodoc) - documents the relation structure of PostgreSQL databases *Rod Taylor*.
- [DOTML](http://www.martin-loetzsch.de/DOTML/) - XML markup to mirror dot language. Includes scripts and XSLT to transform and render *Martin Loetzsch*.
- [DBGraphNav](https://code.google.com/archive/p/dbgraphnav) - Tool to facilitate the browsing of data within relational databases. *Paul McMillan*.
- [EMF To Graphviz](https://sourceforge.net/projects/emf2gv/) - Eclipse plugin that helps to transform an EMF model into a diagram using Graphviz. 
- [graphstk](https://github.com/dgnorton/graphstk) - Generate graphviz from golang stack trace.
- [node-it](https://github.com/cfstras/node-it) - subreddit grapher with graphviz written in golang.
- [lsofgraph](https://github.com/zevv/lsofgraph) - A small utility to convert Unix lsof output to a graph showing FIFO and UNIX interprocess communication by *Ico Doornekamp*.

#### AI and Language Tools 
- [txt2graph](http://andreas-romeyke.de/txt2graph/txt2graph.html) - visualize the structure and dependencies of a text read from stdin and generates a dot-File for graphviz to stdout *Andreas Romeyke* 
- [Ontoviz](https://protegewiki.stanford.edu/wiki/OntoViz) - is a plugin for displaying knowledge base diagrams in the- [Protoge](https://protege.stanford.edu/) - system 
- [Topic extraction using Wikipedia data](http://blog.prashanthellina.com/topic-extraction-using-wikipedia-data.html). 
- [FcaStone](http://fcastone.sourceforge.net/) Lays out algebraic lattices in the sense of Formal Concept Analysis. Try the [demo](http://www.upriss.org.uk/fca/fcademo.html) or the [lattice visualisations of Roget's Thesaurus](http://www.ketlab.org.uk/roget.html)) *Uta Priss*.
- [CorpusExplorer](https://notes.jan-oliver-ruediger.de/software/corpusexplorer-overview/) - FOSS for Corpuslinguists & Text-/Data-Mining with GraphViz Export by *Jan Oliver Rüdiger*

#### Network and Web Engineering Tools 
- [DNSViz](http://dnsviz.net/) - a DNS visualization tool 
- [TraceViz](http://hokstad.com/traceviz-visualizing-traceroute-output-with-graphivz) - Traceroute visualization with sharp-looking SVG styles *Vidar Hokstad* 
- [afterglow](http://afterglow.sourceforge.net/) is a collection of scripts to generate graphs for Graphviz (and LGL), from various network logs and firewall rulesets *Raffael Marty*
- [SMART](https://sourceforge.net/projects/safemap/) - passive network flow visualization tool *Cisco's Critical Infrastructure Assurance Group (CIAG) Research team* 
- [CSO Online](https://www.csoonline.com/article/2122766/malware-cybercrime/what-a-botnet-looks-like.html) - What a Botnet Looks like *David Vorel* 
- [EFnet](http://map.efnet.net) - IRC Network server routing maps *Douglas Boldt* 
- [phpOpenTracker](https://sourceforge.net/projects/phpopencounter) - provides a framework solution for the analysis of website traffic and visitor analysis. *Sebastian Bergmann* 
- [apache2dot](http://www.chaosreigns.com/code/apache2dot/) - Apache log file visualizer 
- [sig2dot](http://www.chaosreigns.com/code/sig2dot/) - generates a graph of all of the signature relationships in a GPG/PGP keyring 
- [Rocketfuel](http://research.cs.washington.edu/networking/rocketfuel/) - ISP mapper [see](http://research.cs.washington.edu/networking/rocketfuel/interactive/) *U. Washington* 
- [DNS server visualization](http://www.zonecut.net/dns/) - Visual DNS Server.lich
- [Visitors, a fast web log analyzer](http://www.hping.org/visitors/) - uses graphviz to display usage patterns showing how users are using your web site. *Salvatore Sanfilippo* 
- [graph-tool](https://graph-tool.skewed.de/) - an efficient python module for manipulation and statistical analysis of graphs, which includes an interface to GraphViz, via its python bindings. *Tiago de Paula Peixoto* 
- [dockviz](https://github.com/justone/dockviz/) - Visualizing Docker Data.
- [docker-compose-graphviz](https://github.com/abesto/docker-compose-graphviz) - Turn a docker-compose.yml files into Graphviz .dot files in go.
- [docker-compose-dot](https://github.com/digibib/docker-compose-dot) - Convert docker-compose yaml files to graphviz dot files in go.
- [Dotler](https://github.com/ronin13/dotler) - Dotler is a web crawler and graph generator written in go.
- [sabaviz](https://github.com/tom--bo/sabaviz) - Create dot files for graphviz which visualize servers connections by netstat output in go.
- [Kafka Streams Topology Visualizer](https://github.com/zz85/kafka-streams-viz) - Great solution if you wanna show how streams topologies are tied together.
- [aws-securitygroup-grapher](https://github.com/jeanlouisferey/aws-securitygroup-grapher) - An Ansible role to generate a graphical representation of AWS VPC security groups. *Jean-Louis Férey*
 
#### Programming and Software Engineering Tools 
##### UML and Software-Design
  - [Compendium-TA](https://www.compendiumdev.co.uk/page.php?title=compendiumta) - an integrated package of modelling tools which uses Graphviz for graph layouts *Alan Richardson* 
  - [AsmL](https://www.microsoft.com/en-us/research/project/asml-abstract-state-machine-language/?from=http%3A%2F%2Fresearch.microsoft.com%2Fen-us%2Fprojects%2Fasml%2F) - an executable specification language from Microsoft Research *Yuri Gurevich*, *Margus Veanes*.
  - [ArgoUML Graphviz](http://argouml-graphviz.tigris.org/) - Automatically repositioning all visual elements from UML diagrams that are stored in XMI. These can be exported with DOT to PDF, SVG, PNG, etc. This XLST runs independently of ArgoUML. *Pander* 
  - [Visustin](http://www.aivosto.com/visustin.html) - Visustin flow chart & uml generator *Aivosto* 
  - [APIviz](https://code.google.com/archive/p/apiviz) - is a JavaDoc doclet which extends the Java standard doclet. It generates comprehensive UML-like class and package diagrams. 
  - [PlantUML](http://plantuml.com/) - generates UML diagrams (classes, usecases, activities, components) - using a simple text description language. *Arnaud Roques* 
  - [Grails class diagram plugin](http://grails.org/plugin/class-diagram/) - provides an UML-like diagram of grails domain classes. *Trygve Amundsen* 
  - [tags2uml](https://github.com/ruben2020/tags2uml) - Generates UML class diagrams, from source code with go.
  - [Gravizo](http://www.gravizo.com/) - Simple way of describing graphs and include it easily in your web for free, blog, markdown page, github, and any location where remote images can be showed.
  - [Umple](https://github.com/umple/umple) - Textual language for modeling and code generation of complete executable systems; generates UML class diagrams, state diagrams and entity-relationship diagrams.
  - [gitk-class-diagram](https://github.com/stefandtw/gitk-class-diagram/) - Class diagrams based on commit diffs.

##### Documentation
  - [pointillism.io](https://pointillism.io) - Render your checked-in DOT files straight from your git repos. Supports README.md, wiki, and Confluence documentation.
  - [doxygen](http://www.stack.nl/~dimitri/doxygen/) - Uses graphviz to produce class hierarchies and other diagrams directly from source code *Dimitri van Heesch* 
  - [IsaViz](http://www.w3.org/2001/11/IsaViz/) - A Visual Authoring Tool for RDF *Emmanuel Pietriga* 
  - [Symfony application-map plugin](https://symfony.com/legacy) - an easy-to-use documentation tool for the symfony framework community. *Tomasz Ducin* 
  - [godoc](https://github.com/golang/gddo) - The GoDoc-Project uses graphviz to show the graph of imported packages (see footer of package page on [godoc.org](https://godoc.org/)).

##### Call Graphs
  - [javashot](https://code.google.com/archive/p/javashot) - captures the dynamic execution flow of a Java programa. The traces can be viewed using Graphviz.
  - [CodeViz](https://github.com/petersenna/codeviz) - a call graph generation utility for C/C++ that assumes dot for its back end *Mel Gorman*.
  - [Python call graphs](http://pycallgraph.slowchop.com/en/master/) - Python Call Graph Visualisation.
  - [go-callvis](https://github.com/TrueFurby/go-callvis) - Visualize call graph of your Go program.

##### Dependency
  - [LJV.java](https://www.cs.auckland.ac.nz/~j-hamer/LJV.html) - (Lightweight Java Visualizer) - is tool for visualizing Java data structures with Graphviz. It has been used to good effect in CS1 and CS2-level data structures courses. *John Hammer* 
  - [YaST](https://lizards.opensuse.org/2009/01/19/graph-of-storage-devices/) - openSUSE installation and configuration showing a graph of storage devices with dependencies. *Arvin Schnell* 
  - [chefviz](https://github.com/tom--bo/chefviz) - Chefviz creates the dot files of recipes dependency-graph for graphviz.
  - [go-erd](https://github.com/gmarik/go-erd) - Visualize package's types and their inter-relationships to aid exploring and studying source code.
  - [npm-packages](http://npm.anvaka.com/#/) - Analyze NPM Package Dependencies in 2D and 3D *Andrei Kashcha* aka @anvaka.
  - [graph.generator](https://plugins.gradle.org/plugin/com.vanniktech.dependency.graph.generator) - Gradle plugin that generates dependency graphs from your project. *Niklas Baudy*

##### Schema & Datastructure
  - [Merisedot](http://oss.phear.org/merisedot/) - a tool to generate MCD Entity/Relation graphics of Merise. (Seulement en Français).
  - [Reverse Snowflake Joins](https://sourceforge.net/projects/revj/files/) - is a tool that parses SQL Select statements and generates a diagram. 
  - [myDBR](httP://www.myDBR.com) - is web-based reporting system for relational databases using Graphviz as one of its charting modules. 
  - [Erviz](http://slopjong.de/2011/02/26/whats-erviz/) - an entity-relationship diagram generator that converts plain text files to DOT-formatted graphical files for Graphviz. *Mitsuru Kono* 
  - [GraphQLviz](https://github.com/Macroz/GraphQLviz) - GraphQLviz marries GraphQL (schemas) with Graphviz.
  - [memviz](https://github.com/bradleyjkemp/memviz) - Visualize your data structures using graphviz 
  - [sqliterd](https://github.com/gwenn/sqliterd) - Tool to create a Graphviz dot file from SQLite database schema written in go.

##### Theoretical Computer Science
  - [Ragel](http://www.colm.net/open-source/ragel/) - (think "lex") - compiles executable finite state machines from regular languages and can generate diagrams of the state machines in DOT format. 
  - [Lambda Animator](http://thyer.name/lambda-animator/) - is a tool for demonstrating and experimenting with alternative reduction strategies in the lambda-calculus *Mike Thyer* 
  - [Maria](http://www.tcs.hut.fi/Software/maria/index.en.html) - Modular Reachability Analyzer - a reachability analyzer for concurrent systems that uses Algebraic System Nets as its modelling formalism *Marko Mäkelä* 
  - [Finite State Machine web visualization](http://www.let.rug.nl/vannoord/Fsa/) - interactively accepts input from a form *Gertjan van Noord* 
  - [scxml2dot](https://code.google.com/archive/p/scxml2dot) - a very simple conversion function in perl to plot a finite state machine written in scxml using the graphviz tools. *Fabrizio Morbini* 

##### Others
  - [TheHat workflow engine](https://github.com/svdasein/thehat) - Shows workflows in auto-refreshing webpages *Dave Parker* 
  - [anifsm](http://fmt.cs.utwente.nl/tools/torx/anifsm.1.html) - animates graphs in dot format via tcldot (part of the- [TorX](http://fmt.cs.utwente.nl/tools/torxviz/) - software visualization suite) - *Alex Belinfante and TorX consortium* 
  - [gradle-graphviz-plugin](https://github.com/jeysal/gradle-graphviz-plugin) - A Gradle plugin to make builds using Graphviz portable.
  - [YaccViso](http://www.lo-res.org/~aaron/yaccviso/) - YACC visualization tool 

#### Bioinformatics and Cheminformatics
- [HasseManager](https://github.com/peter-lind/hasse-manager/tree/master/HasseManager) - for visualizing relations between chemical structures used in fragment-based drug discovery, as described in the- [Journal of Chemical Information and Modelling](http://pubs.acs.org/doi/abs/10.1021/ci4004464) - *Peter Lind* 
- [R-Graphviz](http://www.bioconductor.org/packages/release/bioc/html/Rgraphviz.html) - ([guide](http://www.bioconductor.org/packages/release/bioc/vignettes/Rgraphviz/inst/doc/newRgraphvizInterface.pdf)) - from the Bio-Conductor project integrates graphs and statistical models. *Robert Gentleman, Jeff Gentry and the R team* 
 
#### Document preparation 
- [dot2tex](https://dot2tex.readthedocs.io/en/latest/) - LaTeX-friendly converter from Graphviz (xdot) - to converting xdot PSTricks or PGF/TikZ commands, with support for LaTeX labels and arrows. *Kjell Magne Fauske*.
- [graphviz mode for emacs](http://ppareit.github.io/graphviz-dot-mode/) - (or- [here](https://graphviz.org/_pages/Misc/graphviz-dot-mode.el)). 
- [Ladot](http://brighten.bigw.org/projects/ladot/) - scripts for including LaTeX in your Graphviz files *Brighten Godfrey* 
- [TeXmacs](http://www.texmacs.org/tmweb/home/welcome.en.html) - a scientific text editor, inspired by TeX and GNU Emacs, has a Graphviz interface *Joris van der Hoeven* 
- [Mac OmniGraffle](https://www.omnigroup.com/omnigraffle/) - *Omni Group* 
- [GraphVizio](http://www.calvert.ch/graphvizio/) - is an addin for Visio to lay out diagrams using Graphviz (also see- [blog post](http://www.calvert.ch/maurice/2010/05/11/graphvizio-a-graphviz-addin-for-visio/)). *Maurice Calvert* 
- [TeX and PSTRICKS](http://web.ncf.ca/en493/GRAPHVIZ-TEX/graphviz.html) - describes how to use PSTRICKS in conjunction with TeX to include Graphviz PostScript output into TeX documents. This approach makes further manipulation, such as rotation,shifting, etc. easy. *Roger Herz-Fischler* 
- [graphviz2drawio](https://github.com/hbmartin/graphviz2drawio) - Convert graphviz to draw.io (mxGraph) format *Harold Martin* 
 
#### Linux Distributions 
- [Debian](https://packages.debian.org/search?suite=all&searchon=names&keywords=graphviz) - Linux packages for several architectures. 
- [Gentoo](https://packages.gentoo.org/packages/media-gfx/graphviz) - Linux packages. 
- [SuSE](https://software.opensuse.org/search?q=graphviz) - rpms for Novell/SuSE distributions for many architectures. 
- [Ubuntu](https://packages.ubuntu.com/search?keywords=graphviz&searchon=names&suite=all&section=all) - Linux packages.

### Package Search and Further Collections
#### Packages
- [libraries.io](https://libraries.io/search?q=graphviz) - Meta Package Search
- [npm packages](https://www.npmjs.com/browse/keyword/graphviz) - npm packages.
- [CPAN](http://search.cpan.org/search?query=graphviz&mode=all) - The ultimative PERL Source.
- [RPM Find](http://fr2.rpmfind.net/linux/rpm2html/search.php?query=graphviz&submit=Search+...&system=&arch=) - many distros and architectures.
- [GoLangLibs](https://golanglibs.com/search?q=graphviz) - Three pages full of Go Packages.
- [Go Search](http://go-search.org/search?q=graphviz) - Searching in over 700k Golang Files and Packages.
- [GoDoc](https://godoc.org/?q=graphviz) - Query through all the Go Package Documentation.
- [Maven Central](https://search.maven.org/#search%7Cga%7C1%7Cgraphviz) - Find the most actual Jar-Files.

#### More to find
- [Stack Overflow](https://stackoverflow.com/search?q=graphviz) - Found thousands Questions & Answers for graphviz
- [Google Code](https://code.google.com/archive/search?q=graphviz) - Over 100 more references
- [DMOZ Graph Drawing](https://dmoztools.net/Science/Math/Combinatorics/Software/Graph_Drawing/) - DMOZ Category Science > Math > Combinatorics > Software > Graph Drawing 
- [DMOZ Graph Theory](https://dmoztools.net/Science/Math/Combinatorics/Graph_Theory/) - Science > Math > Combinatorics > Graph Theory 
- [Quora](https://www.quora.com/topic/GraphViz) - Quora Topic Search. Fulltext-Search [here](https://www.quora.com/search?q=graphviz).
- [DockerHub](https://hub.docker.com/search/?isAutomated=0&isOfficial=0&page=1&pullCount=1&q=graphviz&starCount=0) - Found over 100 Docker Images with Graphviz included.

