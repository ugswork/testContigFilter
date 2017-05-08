/*
A KBase module: umaContigFilter
This sample module contains one small method - filter_contigs.
*/

module umaContigFilter {
    /* 
        A 'typedef' allows you to provide a more specific name for
        a type.  Built-in primitive types include 'string', 'int',
        'float'.  Here we define a type named assembly_ref to indicate
        a string that should be set to a KBase ID reference to an
        Assembly data object.
    */
    typedef string assembly_ref;

    /*
        A 'typedef' can also be used to define compound or container
        objects, like lists, maps, and structures.  The standard KBase
        convention is to use structures, as shown here, to define the
        input and output of your function.  Here the input is a
        reference to the Assembly data object, a workspace to save
        output, and a length threshold for filtering.

        To define lists and maps, use a syntax similar to C++ templates
        to indicate the type contained in the list or map.  For example:

            list <string> list_of_strings;
            mapping <string, int> map_of_ints;
    */

    typedef structure {
        int libfile_input_lib;                  /*  (=20)  minimum k value (<=124) */
        int libfile_input_unpaired;                  /*  (=20)  minimum k value (<=124) */
        int libfile_input_insert;                  /*  (=20)  increment of k-mer of each iteration  */
    } libfile_args_type;

    typedef structure {
        assembly_ref assembly_input_ref;
        string workspace_name;
        int min_length;
	    list<libfile_args_type> libfile_args;
	    list<string> extra_params;
    } FilterContigsParams;


    /*
        Here is the definition of the output of the function.  The output
        can be used by other SDK modules which call your code, or the output
        visualizations in the Narrative.  'report_name' and 'report_ref' are
        special output fields- if defined, the Narrative can automatically
        render your Report.
    */
    typedef structure {
        string report_name;
        string report_ref;
        assembly_ref assembly_output;
        int n_initial_contigs;
        int n_contigs_removed;
        int n_contigs_remaining;
    } FilterContigsResults;

    /*
        The actual function is declared using 'funcdef' to specify the name
        and input/return arguments to the function.  For all typical KBase
        Apps that run in the Narrative, your function should have the
        'authentication required' modifier.
    */
    funcdef filter_contigs(FilterContigsParams params)
        returns (FilterContigsResults output) authentication required;

    /**  start addition  **/

    typedef string strType;
    typedef int    intType;

    typedef structure {
        string   workspace_name;
        strType  testStr;
        int      testInt;
    } TestParams;

    typedef structure {
        strType result_str;
        intType result_length;
    } testResult;

    funcdef myStringFunc(TestParams test_params)
        returns (testResult output) authentication required;

    /**  end addition  **/

};
