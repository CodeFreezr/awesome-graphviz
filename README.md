# Awesome GraphViz [![Awesome](https://awesome.re/badge.svg)](https://awesome.re)

A curated list of GraphViz stuff.  

![GraphViz](GraphvizLogo.png)

These are some representative internal and external resources.  

The list includes tools that complement Graphviz, such as graph generators, postprocessors and interactive viewers. Additional the most important internal resource will be linked. It also includes higher level systems and web sites that rely on Graphviz as a visualization service. You can also find Graphviz-related projects in <a href="http://code.google.com/hosting/search?q=graphviz" target="_blank">Google Code</a>. 



See contribution.md (tbd) how to add additional resource via pull requests.  


## Table of Content
* [Graphviz Distribution](#graphviz-distribution)
  * [Introductions](#introductions)
  * [Entities](#entities)
  * [Attributes](#attributes)
  * [Layout\-Types](#layout-types)
  * [Tools](#tools)
  * [API](#api)
* [Theory &amp; Publication (tbd)](#theory--publication-tbd)
  * [Graphviz Papers (tbd)](#graphviz-papers-tbd)
  * [Graph Drawing (tbd)](#graph-drawing-tbd)
  * [Information Visualization (tbd)](#information-visualization-tbd)
* [Graphical Interfaces](#graphical-interfaces)
  * [Web\-Interface](#web-interface)
  * [Editor Addons](#editor-addons)
  * [\.NET / C\#](#net--c)
  * [Mac OS](#mac-os)
  * [Java](#java)
  * [Other](#other)
  * [Platforms](#platforms)
* [Language Bindings](#language-bindings)
  * [Libs for Node / JS / JQuery / D3](#libs-for-node--js--jquery--d3)
  * [Libs for Python](#libs-for-python)
  * [Libs for Django](#libs-for-django)
  * [Libs for Go](#libs-for-go)
  * [Libs for Java](#libs-for-java)
  * [Libs for C\# and \.NET](#libs-for-c-and-net)
  * [Libs for Perl](#libs-for-perl)
  * [Libs for Ruby:](#libs-for-ruby)
  * [Others:](#others)
  * [Confluence/Jira:](#confluencejira)
  * [CMS (Wiki/Blog):](#cms-wikiblog)
* [Generators and Translators](#generators-and-translators)
  * [Transform data sources and formats into Graphviz\.](#transform-data-sources-and-formats-into-graphviz)
  * [AI and Language Tools](#ai-and-language-tools)
  * [Network and Web Engineering Tools](#network-and-web-engineering-tools)
  * [Programming and Software Engineering Tools](#programming-and-software-engineering-tools)
  * [Bioinformatics and Cheminformatics](#bioinformatics-and-cheminformatics)
  * [Document preparation with Graphviz](#document-preparation-with-graphviz)
  * [Social Networking and Collaborative Work](#social-networking-and-collaborative-work)
  * [Third\-Party Distributions](#third-party-distributions)
* [Package Search and Further Collections](#package-search-and-further-collections)
  * [Packages](#packages)
  * [More to find](#more-to-find)

## Content

### Graphviz Distribution

#### Introductions
- [Homepage](https://graphviz.org/) - The official Homepage
- [git](https://gitlab.com/graphviz/graphviz/) - The master GIT Repository for graphvi
- [About Graph Visualisation](https://www.graphviz.org/about/) - A Summary about Graph Visualisation
- [Wikipedia- Graphviz](https://en.wikipedia.org/wiki/Graphviz) -  Wikipedia page about Graphviz
- [Wikipedia- DOT](https://en.wikipedia.org/wiki/DOT_(graph_description_language)) -  Great starter into the DOT / GV Language
- [Changelog](https://gitlab.com/graphviz/graphviz/blob/master/ChangeLog) - Changelog starting from March 13, 2000

#### Entities
- [All in One](https://graphviz.gitlab.io/_pages/doc/info/lang.html) -  The DOT Language 
- [Node](https://graphviz.gitlab.io/_pages/doc/info/shapes.html) - A node in the primary element in a graph.
- [Edge](https://graphviz.gitlab.io/_pages/doc/info/arrows.html) - An edge connect two nodes.
- [Graph]() - All entities are placed within a graph or digraph (tbd)
- [Cluster/Subgraph](https://graphviz.gitlab.io/_pages/Gallery/directed/cluster.html) - Devides the graph

#### Attributes
- [All in One](https://graphviz.gitlab.io/_pages/doc/info/attrs.html) - All Attributes of all Entities in one page
- [Colors](https://graphviz.gitlab.io/_pages/doc/info/colors.html) - Overview of graphviz colornames
- [Arrow Shapes](https://graphviz.gitlab.io/_pages/doc/info/arrows.html) - All possible arrowheads
- [Node Shapes](https://graphviz.gitlab.io/_pages/doc/info/shapes.html) - All possible builtin shapes

#### Layout-Types
- [circo]() - (tbd)
- [dot]() - (tbd)
- [fdp]() - (tbd)
- [neato]() - (tbd)
- [osage]() - (tbd)
- [patchwork]() - (tbd)
- [sfdp]() - (tbd)
- [twopi]() - (tbd)

#### Tools
- GUI
  - [dotty]() - A Customizable Graph Editor - (tbd)
  - [gvedit]() - simple graph editor and viewer - (tbd)
  - [lefty]() - A Programmable Graphics Editor - (tbd)
  - [lneato]() - Editor on top of neato & lefty - (tbd)
  - [smyrna]() - interactive graph viewer - (tbd)
  - [vimdot]() - Combined text editor and dot viewer - (tbd)

- Graph Analysis
  - [acyclic]() -  make directed graph acyclic  - (tbd)
  - [bcomps]() - biconnected components filter for graphs - (tbd)
  - [cluster]() - find clusters in a graph and augment the graph with this information - (tbd)
  - [ccomps]() - connected components filter for graphs - (tbd)
  - [diffimg]() - Calculates intersection between two images - (tbd)
  - [dijkstra]() - single-source distance filter - (tbd)
  - [edgepaint]() - edge coloring to disambiguate crossing edges - (tbd)
  - [gc]() - count graph components - (tbd)
  - [gvcolor]() - flow colors through a ranked digraph - (tbd)
  - [gvgen]() - generate graphs - (tbd)
  - [gvmap]() - find clusters and create a geographical map highlighting clusters - (tbd)
  - [gvpack]() - merge and pack disjoint graphs - (tbd)
  - [gvpr]() - graph pattern scanning and processing language - (tbd)
  - [mingle]() - fast edge bundling - (tbd)
  - [nop]() - pretty-print graph file - (tbd)
  - [sccmap]() - extract strongly connected components of directed graphs - (tbd)
  - [tred]() - transitive reduction filter for directed graphs - (tbd)
  - [unflatten]() - adjust directed graphs to improve layout aspect ratio - (tbd)
    
- Converter
  - [mm2gv]() - Matrix Market-DOT converters - (tbd)
  - [gxl2gv]() - GXL-GV converters - (tbd)
  - [gml2gv]() - GML-DOTconverters - (tbd)
  - [graphml2gv]() - GRAPHML-DOT converter - (tbd)

#### API
- Language Bindings
  - [C-Code Samples]() - (tbd)
  - [C libraries]() - (tbd)
  - [Guile]() - (tbd)
  - [Java]() - (tbd)
  - [Perl]() - (tbd)
  - [PHP]() - (tbd)
  - [Python]() - (tbd)
  - [Ruby]() - (tbd)
  - [TCL/TK libraries]() - (tbd)
- Misc
  - [Schema Files]() - (tbd)

### Theory & Publication (tbd)
#### Graphviz Papers (tbd)
#### Graph Drawing (tbd)
#### Information Visualization (tbd)


### Graphical Interfaces

#### Web-Interface
- [Viz-Js](http://ushiroad.com/jsviz/) - DHTML-based interactive viewer for Graphviz *Satoshi Ueyama*
- [GraphvizOnline](http://dreampuf.github.io/GraphvizOnline/) - Online Editor with Syntax Higlighting
- [Graphviz.it](http://graphviz.it) - Online-Editor with all the standard examples, based on [graph-viz-d3-js](#graph-viz-d3-js)
- [Canviz](http://www.ryandesign.com/canviz/) - an HTML5/Javascript canvas viewer (beta). *Ryan Schmidt* 
- [Graphviz Test Tool](https://sites.google.com/site/kuabus/programming-by-hu/graphviz-test-tool) - a GUI front-end for Graphviz *Hansuli Anderegg * 
- [GraphvizFiddle](https://stamm-wilbrandt.de/GraphvizFiddle/) - a dual-view Graphviz editor *Hermann Stamm-Wilbrandt* 
- [jQuery.Graphviz](https://github.com/goinnn/jquery.graphviz) - a jQuery based interactive graph viewer for graphviz svg *Pablo Martín* 
- [an AJAX viewer](http://ashitani.jp/gv/) written with Rico *T. Ashitani* 
- [Online Graphviz Generator](http://fiane.mooo.com:8080/graphviz/) - Simple Online Generator with Go Server


#### Editor Addons
- [Graphviz for vscode](https://marketplace.visualstudio.com/items?itemName=Stephanvs.dot) - Graphviz (dot) Syntax Highlight and snippets for Visual Studio Code *Stephanvs*
- [Graphviz Preview](https://marketplace.visualstudio.com/items?itemName=EFanZh.graphviz-preview) - Inline Preview inside vs code editor *EFanZh*
- [Eclipse Zest/DOT](http://wiki.eclipse.org/Zest/DOT) - an Eclipse Zest 2.0 component that can be used to render and edit DOT graphs *Fabian Steeg* 

#### .NET / C#
- [GraphSpe](http://www.graphspe.com/#/Home) - includes a converter for Microsoft Silverlight Xaml (SVG based) *Ceyhun Ciper* 
- [Graphviz4Net](http://graphviz4net.codeplex.com/) provides Windows Presentation Foundation (WPF) control that is capable of rendering graph layouts using Graphviz. *Štěpán Šindelář* 
- [Wigraf](https://github.com/kml/Wigraf) - a Windows graphviz frontend based on WinGraphviz and C# .NET. "Graf" is polish for "graph." *Kamil Lemański* 

#### Mac OS
- [Instaviz](http://instaviz.com/) - graph sketching for the iPhone using Graphviz libraries for rendering. *Glen Low* 
- [Pixelglow's document-based GUI](http://www.pixelglow.com/graphviz/) for Mac OS X (slightly out of date, but won a 2004 award from Apple) *Glen Low* 

#### Java
- [idot](http://code.google.com/p/idot/) - an incremental Graphviz viewer (Java ≥ 1.5 with the excellent 
- [Yoix](http://www.yoix.org/) a scripting language implemented in Java with a data visualization module called YDAT that provides interactive display of GraphViz files (use -Txdot -y) *John Mocenigo* 
- [TINTFU](http://tintfu.sourceforge.net/) - a Java-based editor for .dot graph files. *Walter Stroebel* 

#### Other
- [ZGRViewer](http://zvtm.sourceforge.net/zgrviewer.html) - an SVG-based zooming graph viewer for large graphs *Emmanuel Pietriga* 
- [prefuse](http://prefuse.org/) toolkit). *Mikko Vinni* 
- [KGraphViewer](http://extragear.kde.org/apps/kgraphviewer/) - a KDE viewer for layouts generated by Graphviz tools. *Gaël de Chalendar* 
- [BioGrapher](http://www.bioquest.org/esteem/esteem_details.php?product_id=6509) Excel front-end (WinXP and Mac) for Graphviz that allows the user to specify graphs in a spreadsheet using adjacency matrix, node list or Newick notation (for phylogenetic trees) and visualize the layout generated by Graphviz as an Excel (vector graphics) picture object. *Rama Viswanathan* 
- [xdot.py](http://freecode.com/projects/xdot_py) - an interactive viewer for graphs. *Jose Fonseca* 
- [Leonhard](https://github.com/glejeune/Leonhard) - a simple viewer/editor for GraphViz, developed with MacRuby. (See the [demo](http://youtu.be/nyfZVGlErTo).) 
- [EasyGraphViz](http://wiki.cyze.jp/wiki.cgi/software?page=EasyGraphViz) - a Japanese editor for Graphviz. *Nikolaos Kavvadias*
- [NodeViz](http://code.google.com/p/nodeviz/) - a php framework for mapping relational data to highly styled Graphviz and displaying interactively in web clients *Greg Michalec and Skye Bender-deMoll* 

#### Platforms
- [Gephi](https://gephi.org/) - The Open Graph Viz Platform *Mathieu Bastian*
- [IdeaTree](http://www.myideatree.com/) - a platform for concurrent, shared knowledge mapping
- [Observable](https://beta.observablehq.com/) - Common Map, Chart & Diagram creation with graphviz support
- [Bl.ock](https://bl.ocks.org/) - Common Mapp, Chart & Diagram creation with graphviz support



### Language Bindings 
 
#### Libs for Node / JS / JQuery / D3
- [viz.js](https://github.com/mdaines/viz.js/) - This project builds Graphviz with Emscripten and provides a simple wrapper for using it in the browser.
- [d3-graphviz](https://github.com/magjac/d3-graphviz) - Renders SVG from graphs described in the DOT language using the Viz.js port of Graphviz and does animated transitions between graphs. *Magnus Jacobsson*
- [graph-viz-d3-js](https://github.com/mstefaniuk/graph-viz-d3-js) - Bower component graphviz-d3-renderer renders Graphviz source in the browser with d3.js
- [d3-dot-graph](https://github.com/gmamaladze/d3-dot-graph) - This module provides D3js compatible library to parse and load files in graphviz DOT (.dot) (graph description language) format.
- [jquery.graphviz.svg](http://github.com/mountainstorm/jquery.graphviz.svg/) - jQuery plugin to make Graphviz SVG output more interactive and easier to navigate. *Rich Cooper* 
- [node-graphviz](https://github.com/glejeune/node-graphviz) - Interface to the GraphViz graphing tool

#### Libs for Python
 - [Pydot](http://code.google.com/p/pydot/) - a python interface to Graphviz (Windows comptible). 
 - [Python-Graph](http://code.google.com/p/python-graph/) - A library for working with graphs in Python. 
 - [PyGraphviz](http://networkx.lanl.gov/pygraphviz/) - a python interface to Graphviz similar to NetworkX. 
 - [yapgvb](http://yapgvb.sourceforge.net/) Yet Another Graphviz Python Binding *Lonnie Princehouse* 
 - [mfgraph](http://realmike.org) - C++ interface with native bindings for python *Michael Föetsch* 
 - [GvGen](https://github.com/stricaud/gvgen) - a python class to generate dot files *Sebastien Tricaud* 
 
#### Libs for Django
 - [django-graphviz](http://code.google.com/p/django-graphviz/) - a Django app using Graphviz. 
 - [DjangoGraphviz](https://code.djangoproject.com/wiki/DjangoGraphviz) - Converts Django models into Graphviz DOT files. 

#### Libs for Go  
 - [gographviz](http://code.google.com/p/gographviz/) - a Graphviz parser for go *Walter Schulze*. 
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
 - [Online Graphviz Generator](https://github.com/noselasd/gvweb) - Type in Graphviz graph language and display the generated image, see example: [web](http://fiane.mooo.com:8080/graphviz/)
 - [Graphviz as a Service](https://github.com/djmattyg007/graphviz-server) - a webserver that responds rendered graphs in PNG format.
 
#### Libs for Java
 - [Eclipse plugin](http://sourceforge.net/projects/eclipsegraphviz/) 
 - [JPGD](http://www.alexander-merz.com/graphviz/): A Java parser for Graphviz documents *Alexander Merz* 
 - [Java API](https://github.com/jabbalaci/graphviz-java-api) *Laszlo Szathmary* 
 - [jGraphViz](http://jgraphviz.sourceforge.net/) - Java bindings for libGraphViz *schmeeky*
 
#### Libs for C# and .NET
 - [graphviznet](http://code.google.com/p/graphviznet/) 
 - [CodePlex QuickGraph](http://www.codeplex.com/quickgraph/) 
 - [Tigris QuickGraph](http://quickgraph.tigris.org/source/browse/quickgraph/trunk/src/) 
 - [WinGraphviz](http://wingraphviz.sourceforge.net/wingraphviz/) component *Ood Tsen* 
 
#### Libs for Perl
- [webdot.pl](???) in perl *Stephen North*, with a huge assist from *John Linderman* 
- [Graphviz2](https://metacpan.org/release/GraphViz2) - perl interface, supports new options *Ron Savage* 
- [GraphViz2::Marpa](https://metacpan.org/release/GraphViz2-Marpa) - a Marpa-based parser for DOT files. *Ron Savage* 
- [A Perl interface to Graphviz](http://search.cpan.org/~lbrocard/GraphViz-2.02/lib/GraphViz.pm) *Leon Brocard* 
- [Tk::GraphViz](http://search.cpan.org/~jgs/Tk-GraphViz/) - a perl module for displaying graphs in a perl/TK canvas *Jeremy Slade* 
- [Graph-ReadWrite](http://search.cpan.org/~neilb/Graph-ReadWrite/) - module that supports 'dot' syntax graphs *Neil Bowers* 
- [GraphViz::DBI](http://search.cpan.org/search?dist=GraphViz-DBI) - graph database tables and their relationships *Marcel Grunauer* 
- [GraphViz::ISA](http://search.cpan.org/~marcel/GraphViz-ISA-1.100860/lib/GraphViz/ISA.pm) - graph Perl packages' ISA runtime hierarchies *Marcel Grunauer* 
- [Graph::Easy](http://search.cpan.org/~tels/Graph-Easy/) is a rectilinear graph drawing program compatible with Graphviz and written  



#### Libs for Ruby:  
- [GraphR](http://rockit.sourceforge.net/subprojects/graphr/) Graph-related Ruby classes using graphviz *Robert Feldt* 
- [Ruby-Graphviz](https://github.com/glejeune/Ruby-Graphviz/) - Ruby interface to Graphviz *Grégoire Lejeune* 
 
#### Others: 
- [MatLab](http://www.mathworks.com/matlabcentral/fileexchange/4518) *Leon Peshkin* 
- [R-Graphviz](#Rgraphviz) 
- [webdot](https://gitlab.com/graphviz/webdot) in TCL *John Ellson*  
 
#### Confluence/Jira: 
- [Graphviz Diagrams for Confluence](https://marketplace.atlassian.com/plugins/com.atlassian.confluence.extra.graphviz/server/overview) - Generate and display graphs based on Graph Visualization Software (Graphviz) and the DOT language. *Bob Swift*
- [Graphviz Cloud](https://marketplace.atlassian.com/plugins/com.addteq.graphviz/cloud/overview) - Create and render Graphviz diagrams for Confluence Cloud *Addteq*
- [Digraph Macro](The Digraph Macro creates directed graphs using the Graphviz language.) *Bob Swift*
- [GraphViz/PlantUML](https://avono-support.atlassian.net/wiki/spaces/PUML/overview) - Adding PlantUML Diagram in Confluence-Wiki with DOT-Language *Michael Griffel*

#### CMS (Wiki/Blog): 
- [MediaWiki-1](http://search.cpan.org/~tels/mediawiki-graph/) extension. *Tels* 
- [MediaWiki-2](http://www.mediawiki.org/wiki/Extension:GraphViz) extension *Coffman* 
- [Drupal](http://drupal.org/project/graphviz_filter) Graphviz filter *Karim Ratib* 
- [Wordpress EHT Graphviz](http://ociotec.com/index.php/2008/02/25/eht-graphviz-plugin-para-wordpress/) plugin for  - [Wordpress](http://wordpress.org/), to allow Graphviz images to be easily integrated into a Wordpress page. *Emilio González Montaña* 
- [Wordpress Graphviz](http://wordpress.org/plugins/wp-graphviz/) plugin for  - [Wordpress](http://wordpress.org/), to allow Graphviz images to be easily integrated into a Wordpress page. * - [DeBAAT](http://profiles.wordpress.org/debaat/)* 
- [DokuWiki](https://www.dokuwiki.org/plugin:graphviz) directed and non-directed graph images from “dot” language *Andreas Gohr* 
 
 
### Generators and Translators 


#### Transform data sources and formats into Graphviz. 
- [ExcelToGraphviz1](https://sourceforge.net/projects/relationship-visualizer/) - Relationship Visualizer - Convert Excel data into Graphviz graphs *Jeff Long* 
- [ExcelToGraphviz2](https://sourceforge.net/projects/excel-to-graphviz/) - a tool for visualizing Excel data as graphs *Matt Castelli* 
- [Graph API](http://drupal.org/project/graphapi/) - a Drupal graph generation module with Graphviz Dot output capabilities. *Sebastian Daniel* 
- [SchemaSpy](http://schemaspy.sourceforge.net/) - analyzes and displays metadata for any database via JDBC, letting you click through a hierarchy of tables *John Currier* 
- [WorldCat xISSN](http://www.worldcat.org/xissn/titlehistory) - shows the history of a journal indexed by ISSN *OCLC Online Computer Library Center, Inc.* 
- [Linguine Maps](http://www.softwaresecretweapons.com/lm_hibernate.html) - visualize XML DTDs, Apache Object Relational Bridge Files, Apache Ant Build files, and provide a clean Java API for diagramming *Pavel Simakov* 
- [PostgreSQL AutoDoc](https://github.com/cbbrowne/autodoc) - documents the relation structure of PostgreSQL databases *Rod Taylor* 
- [DOTML](http://www.martin-loetzsch.de/DOTML/) - XML markup to mirror dot language. Includes scripts and XSLT to transform and render *Martin Loetzsch* 
- [S-DOT](http://www.martin-loetzsch.de/S-DOT/) - a Common Lisp interface to dot *also Martin Loetzsch* 
- [SqlPP](http://www.codeproject.com/Articles/4603/A-scripted-SQL-query-generation-framework-with-IDE) - a scripted SQL query generation framework that generates graphviz 
- [SQL Fairy](http://sqlfairy.sourceforge.net/) - a group of Perl modules that manipulate structure data definitions (mostly database schemas) - in interesting ways, such as visualizations of schemas (pseudo-ER diagrams Graphviz or GD) - *Szilárd Vajda* 
- [DBGraphNav](http://code.google.com/p/dbgraphnav/) - a tool to facilitate the browsing of data within relational databases. *Paul McMillan* 
- [EMF To Graphviz](http://sourceforge.net/projects/emf2gv/) - an Eclipse plugin that helps to transform an EMF model into a diagram using Graphviz. 


#### AI and Language Tools 
- [txt2graph](http://andreas-romeyke.de/txt2graph/txt2graph.html) - visualize the structure and dependencies of a text read from stdin and generates a dot-File for graphviz to stdout *Andreas Romeyke* 
- [Ontoviz](http://protegewiki.stanford.edu/wiki/OntoViz) - is a plugin for displaying knowledge base diagrams in the- [Protoge](http://protege.stanford.edu/) - system 
- [CanooNet](http://www.canoo.net/services/WordformationDictionary/Controller) - , a German word formation dictionary. (Try- [_Blockflöte_](http://www.canoo.net/services/WordformationDictionary/Controller?asp=1&input=blockfl%F6te&features=%28Cat+N%29%28Gender+F%29&lang=de&country=CH&lookup=caseInSensitive),- [_Hochschule_](http://www.canoo.net/services/WordformationDictionary/Controller?asp=1&input=hochschule&features=%28Cat+N%29%28Gender+F%29&lang=de&country=CH&lookup=caseInSensitive) - or- [_Massanzug_](http://www.canoo.net/services/WordformationDictionary/Controller?asp=1&input=massanzug&features=%28Cat+N%29%28Gender+M%29&lang=de&country=CH&lookup=caseInSensitive) - in the entry field) - 
- [DAWG CREATOR](http://www.hotscripts.com/listing/dawgcreator/) - a C++ class for creating a prefix tree representation of a given lexicon. 
- [Topic extraction using Wikipedia data](http://blog.prashanthellina.com/topic-extraction-using-wikipedia-data.html). 
- [FcaStone](http://fcastone.sourceforge.net/) - lays out algebraic lattices in the sense of Formal Concept Analysis. (Try the- [demo](http://www.upriss.org.uk/fca/fcademo.html) - or the- [lattice visualisations of Roget's Thesaurus](http://www.ketlab.org.uk/roget.html)). *Uta Priss* 
 
 
#### Network and Web Engineering Tools 
- [DNSViz](http://dnsviz.net/) - a DNS visualization tool 
- [TraceViz](http://www.hokstad.com/traceviz-visualizing-traceroute-output-with-graphivz.html) - Traceroute visualization with sharp-looking SVG styles *Vidar Hokstad* 
- [afterglow](http://afterglow.sourceforge.net/) - is a collection of scripts to generate graphs for Graphviz (and LGL) - from various network logs and firewall rulesets *Raffael Marty* (see also- [tenshi](http://dev.inversepath.com/trac/tenshi) - for logfile filtering) - 
- [SMART](http://sourceforge.net/projects/safemap) - passive network flow visualization tool *Cisco's Critical Infrastructure Assurance Group (CIAG) - Research team* 
- [CSO Online](http://www.csoonline.com/article/348317/What_a_Botnet_Looks_Like): What a Botnet Looks like (Flash) - *David Vorel* 
- [EFnet](http://map.efnet.net) - IRC Network server routing maps *Douglas Boldt* 
- [netmap](http://netmap.sourceforge.net/) - draws the route connecting you with the Internet 
- [Image_Graphviz](http://pear.php.net/package-info.php?package=Image_Graphviz) - class in PHP's- [PEAR repository](http://pear.php.net/) - *Sebastian Bergmann* 
- [phpOpenTracker](http://www.phpopentracker.de/) - provides a framework solution for the analysis of website traffic and visitor analysis. *Sebastian Bergmann* 
- [Pathalizer](http://pathalizer.sourceforge.net/) - visualizes paths traversed by users through web sites *Arnout Engelen* 
- [apache2dot](http://www.chaosreigns.com/code/apache2dot/) - Apache log file visualizer 
- [sig2dot](http://www.chaosreigns.com/code/sig2dot/) - generates a graph of all of the signature relationships in a GPG/PGP keyring 
- [PHP+Graphviz tool](http://www.hotscripts.com/listing/php-traverser/) - that makes a sitemap of a web site dynamically *Laszlo Szathmary* 
- [Rocketfuel](http://www.cs.washington.edu/research/networking/rocketfuel/) - ISP mapper [see](http://www.cs.washington.edu/research/networking/rocketfuel/interactive/) - *U. Washington* 
- [DNS server visualization](http://www.zonecut.net/dns/) - 
- [tcpdump2dot filter](https://web.archive.org/web/20071104191340/http://www.grotto-group.com/~gulfie/projects/analysis/tcpdump2dot.subpage.html) - to allow admins to network activity *Gulfie* 
- [Visitors, a fast web log analyzer](http://www.hping.org/visitors/) - uses graphviz to display usage patterns showing how users are using your web site. *Salvatore Sanfilippo* 
- [Visualize your firewall](http://jekor.com/gressgraph/) - uses graphviz to produce a graph of your iptables ruleset. *Chris Forno* 
- [graph-tool](https://graph-tool.skewed.de/) - an efficient python module for manipulation and statistical analysis of graphs, which includes an interface to GraphViz, via its python bindings. *Tiago de Paula Peixoto* 
  
 
#### Programming and Software Engineering Tools 
- [TheHat workflow engine](https://fedorahosted.org/TheHat/) - based on IRC, XMPP (Jabber) - shows workflows in auto-refreshing webpages *Dave Parker* 
- [anifsm](http://fmt.cs.utwente.nl/tools/torx/anifsm.1.html) - animates graphs in dot format via tcldot (part of the- [TorX](http://fmt.cs.utwente.nl/tools/torxviz/) - software visualization suite) - *Alex Belinfante and TorX consortium* 
- [doxygen](http://www.doxygen.org/) - uses graphviz to produce class hierarchies and other diagrams directly from source code *Dimitri van Heesch* 
- [nmdepend](http://nmdepend.sourceforge.net/) - is a lightweight link-time dependency analyzer for C/C++ object files and libraries, helps manage cross-directory dependencies *Eddy Pronk* 
- [Lambda Animator](http://thyer.name/lambda-animator/) - is a tool for demonstrating and experimenting with alternative reduction strategies in the lambda-calculus *Mike Thyer* 
- [AsmL](http://research.microsoft.com/en-us/projects/asml/) - an executable specification language from Microsoft Research. 
- [UMLGraph](http://www.umlgraph.org/) - a Java tool for the Declarative Drawing of UML diagrams which generates diagrams using dot *Diomidis Spinellis* (Diomidis also contributed code for a richer set of arrow heads for dot, which he claims were really part of a stealthy plot to have Graphviz taken over by the UML community. :-) - 
- [Merisedot](http://oss.phear.org/merisedot/) - a tool to generate MCD Entity/Relation graphics of Merise. (Seulement en Français) - 
- [RDOC](http://rdoc.sourceforge.net) - Ruby documentation *Dave Thomas* 
- [YaccViso](http://www.lo-res.org/~aaron/yaccviso/) - YACC visualization tool 
- [Callgrind](http://kcachegrind.sourceforge.net/cgi-bin/show.cgi) - makes callgraphs from- [Valgrind](http://kcachegrind.sourceforge.net/cgi-bin/show.cgi/KcacheGrindValgrind) - *Jörg Schillin and Josef Weidendorfer* 
- [Maria](http://www.tcs.hut.fi/Software/maria/index.en.html) - Modular Reachability Analyzer - a reachability analyzer for concurrent systems that uses Algebraic System Nets as its modelling formalism *Marko Mäkelä* 
- [IsaViz](http://www.w3.org/2001/11/IsaViz/): A Visual Authoring Tool for RDF *Emmanuel Pietriga* 
- [Finite State Machine web visualization](http://www.let.rug.nl/vannoord/Fsa/) - interactively accepts input from a form *Gertjan van Noord* 
- [RPMGraph](http://freecode.com/projects/rpmgraph) - uses neato to draw a graph of dependencies between RPMs on RedHat or other RPM based systems *Andrea Lombardoni* 
- [Compendium-TA](http://www.compendiumdev.co.uk/compendium-ta/default.php) - an integrated package of modelling tools which uses Graphviz for graph layouts *Alan Richardson* 
- [CodeViz](https://github.com/petersenna/codeviz) - a call graph generation utility for C/C++ that assumes dot for its back end *Mel Gorman* 
- [Pimentech-DbUtils](http://www.pimentech.fr/technologies/outils/) - utils for writing patterns databases in XML (Extended Entities Relationship diagram (ERA)) - and exporting them to graphviz and sql. 
- [LJV.java](http://www.cs.auckland.ac.nz/~j-hamer/LJV.html) - (Lightweight Java Visualizer) - is tool for visualizing Java data structures with Graphviz. It has been used to good effect in CS1 and CS2-level data structures courses. *John Hammer* 
- [Python call graphs](http://pycallgraph.slowchop.com/en/master/) - 
- [ArgoUML Graphviz](http://argouml-graphviz.tigris.org/) - Automatically repositioning all visual elements from UML diagrams that are stored in XMI. These can be exported with DOT to PDF, SVG, PNG, etc. This XLST runs independently of ArgoUML. *Pander* 
- [Ragel](http://www.complang.org/ragel/) - (think "lex") - compiles executable finite state machines from regular languages and can generate diagrams of the state machines in DOT format. 
- [APIviz](http://code.google.com/p/apiviz/) - is a JavaDoc doclet which extends the Java standard doclet. It generates comprehensive UML-like class and package diagrams. 
- [Reverse Snowflake Joins](http://sourceforge.net/projects/revj) - is a tool that parses SQL Select statements and generates a diagram. 
- [eEye Binary Diffing Suite](http://www.eeye.com/Resources/Security-Center/Research/Tools/eEye-Binary-Diffing-Suite-EBDS) - is a suite of tools for binary differential analysis, especially for reverse engineering patches as well as program updates. 
- [myDBR](httP://www.myDBR.com) - is web-based reporting system for relational databases using Graphviz as one of its charting modules. 
- [ADR](http://www.albertolluch.com/research/adr) - is a system for formal software design by means of graphical methods. *Alberto Lluch Lafuente* 
- [YaST](http://lizards.opensuse.org/2009/01/19/graph-of-storage-devices/) - openSUSE installation and configuration showing a graph of storage devices with dependencies. *Arvin Schnell* 
- [Grails class diagram plugin](http://grails.org/plugin/class-diagram/) - provides an UML-like diagram of grails domain classes. *Trygve Amundsen* 
- [gradle-graphviz-plugin](https://github.com/jeysal/gradle-graphviz-plugin) - A Gradle plugin to make builds using Graphviz portable.
- [PlantUML](http://plantuml.sourceforge.net/) - generates UML diagrams (classes, usecases, activities, components) - using a simple text description language. *Arnaud Roques* 
- [javashot](http://code.google.com/p/javashot/) - captures the dynamic execution flow of a Java programa. The traces can be viewed using Graphviz. 
- [scxml2dot](http://code.google.com/p/scxml2dot/) - a very simple conversion function in perl to plot a finite state machine written in scxml using the graphviz tools. *Fabrizio Morbini* 
- [Erviz](http://slopjong.de/2011/02/26/whats-erviz/) - an entity-relationship diagram generator that converts plain text files to DOT-formatted graphical files for Graphviz. *Mitsuru Kono* 
- [Symfony application-map plugin](http://www.symfony-project.org/plugins/sfApplicationMapPlugin) - an easy-to-use documentation tool for the symfony framework community. *Tomasz Ducin* 
 
 
#### Bioinformatics and Cheminformatics
- [HasseManager](https://github.com/peter-lind/hasse-manager/tree/master/HasseManager) - for visualizing relations between chemical structures used in fragment-based drug discovery, as described in the- [Journal of Chemical Information and Modelling](http://pubs.acs.org/doi/abs/10.1021/ci4004464) - *Peter Lind* 
- [R-Graphviz](http://www.bioconductor.org/packages/release/bioc/html/Rgraphviz.html) - ([guide](http://www.bioconductor.org/packages/release/bioc/vignettes/Rgraphviz/inst/doc/newRgraphvizInterface.pdf)) - from the Bio-Conductor project integrates graphs and statistical models. *Robert Gentleman, Jeff Gentry and the R team* 
- [protein database visualization](http://www.stke.org/) -  *American Association for the Advancement of Science (AAAS) - and Stanford University Digital Libraries Project* 
- [Pubgene](http://www.PubGene.com) - Bioinformatic Solutions and Databases for Genomics, Proteomics, and Drug Discovery (go- [here](http://www.pubgene.org) - for original academic web site) - 
- [cancer.gov](http://cmap.nci.nih.gov/PW): National Cancer Institute (NIH) - pathway interaction database (CMAP) -  *Kotien Wu* 
 
 
#### Document preparation with Graphviz 
- [dot2tex](https://dot2tex.readthedocs.io/en/latest/) - is a LaTeX-friendly converter from Graphviz (xdot) - to converting xdot PSTricks or PGF/TikZ commands, with support for LaTeX labels and arrows. *Kjell Magne Fauske* 
- [graphviz mode for emacs](http://ppareit.github.com/graphviz-dot-mode) - (or- [here](** site.url **/_pages/Misc/graphviz-dot-mode.el)). 
- [Ladot](http://brighten.bigw.org/projects/ladot/): scripts for including LaTeX in your Graphviz files *Brighten Godfrey* 
- [graphviz.tex](http://code.google.com/p/hamake/source/browse/trunk/doc/whitepaper/graphviz.tex?r=452): macros for including Graphviz in your LaTeX files *Derek Rayside* 
- [epswrap](http://mharnisch.gmxhome.de/projects.html) - a Perl program that wraps EPS files containing bitmap data for user shapes in Graphviz *Marcus Harnisch* 
- [TeXmacs](http://www.texmacs.org/) - a scientific text editor, inspired by TeX and GNU Emacs, has a Graphviz interface *Joris van der Hoeven* 
- [Visustin flow chart generator](http://www.aivosto.com/visustin.html)*Aivosto* 
- [Mac OmniGraffle](http://www.omnigroup.com/products/omnigraffle/) - *Omni Group* 
- [wdot.rb](http://wdot.rubyforge.org/) - a tool that allows workflow diagrams and flowcharts to be easily created and updated.*Loh Siu Yin* 
- [GraphVizio](http://www.calvert.ch/graphvizio/) - is an addin for Visio to lay out diagrams using Graphviz (also see- [blog post](http://www.calvert.ch/maurice/2010/05/11/graphvizio-a-graphviz-addin-for-visio/)). *Maurice Calvert* 
- [TeX and PSTRICKS](http://web.ncf.ca/en493/GRAPHVIZ/) - describes how to use PSTRICKS in conjunction with TeX to include Graphviz PostScript output into TeX documents. This approach makes further manipulation, such as rotation,shifting, etc. easy. *Roger Herz-Fischler* 
 
 
#### Social Networking and Collaborative Work 
- [Proximity Subgraphs](http://www2.research.att.com/~volinsky/cgi-bin/prox/prox.pl) - visualize communities in the Internet Movie Database 
- [Hammond Jazz Inventory](http://www.hammondjazz.net/index.php?page=article&task=current&mode=detail&section=News&target=70) - show graphical representation of musicians related by recordings in which the Hammond organ plays a significant role (orghammograms!) - 
 
 
#### Third-Party Distributions 
- [Axel Thimm](http://atrpms.net/name/graphviz/) - rpms for some RedHat Linux distributions ("atrpms"). 
- [RPM Find](http://fr2.rpmfind.net/linux/rpm2html/search.php?query=graphviz&submit=Search+...&system=&arch=) - many distros and architectures. 
- [Debian](http://packages.debian.org/search?suite=all&searchon=names&keywords=graphviz) - Linux packages for several architectures. 
- [Gentoo](http://packages.gentoo.org/package/media-gfx/graphviz) - Linux packages. 
- [Fedora Extras](http://download.fedora.redhat.com/pub/fedora/linux/extras/) - rpms for Fedora Core 3 and later. 
- [SuSE](http://software.opensuse.org/search?q=graphviz) - rpms for Novell/SuSE distributions for many architectures. 
- [Ubuntu](http://packages.ubuntu.com/search?keywords=graphviz&searchon=names&suite=all&section=all) - Linux packages.

### Package Search and Further Collections
#### Packages
- [libraries.io](https://libraries.io/search?q=graphviz) - Meta Package Serach
- [npm packages](https://www.npmjs.com/browse/keyword/graphviz) - npm packages with keyword ‘graphviz’
- [CPAN](http://search.cpan.org/search?query=graphviz&mode=all) - The ultimative PERL Source
- [rpmfind](https://rpmfind.net/linux/rpm2html/search.php?query=graphviz&submit=Search+...&system=&arch=) - RPM resource graphviz on rpmfind
- [GoLangLibs](https://golanglibs.com/search?q=graphviz) - Three pages full of Go Packages incorporated graphviz
- [Go Search](http://go-search.org/search?q=graphviz) - Searching in over 700k Golang Files and Packages
- [GoDoc](https://godoc.org/?q=graphviz) - Query through all the Go Package Documentation



#### More to find
- [Google Code](http://code.google.com/hosting/search?q=graphviz) - Over 100 more references
- [DMOZ Graph Drawing](https://dmoztools.net/Science/Math/Combinatorics/Software/Graph_Drawing/) - DMOZ Category Science > Math > Combinatorics > Software > Graph Drawing 
- [DMOZ Graph Theory](https://dmoztools.net/Science/Math/Combinatorics/Graph_Theory/) - Science > Math > Combinatorics > Graph Theory 
- [stackovervlow](https://stackoverflow.com/search?q=graphviz) - Found over 1000 Questions & Answers for graphviz