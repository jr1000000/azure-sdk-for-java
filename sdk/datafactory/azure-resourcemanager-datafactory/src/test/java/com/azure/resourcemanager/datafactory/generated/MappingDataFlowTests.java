// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DataFlowSink;
import com.azure.resourcemanager.datafactory.models.DataFlowSource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MappingDataFlow;
import com.azure.resourcemanager.datafactory.models.Transformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MappingDataFlowTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MappingDataFlow model =
            BinaryData
                .fromString(
                    "{\"type\":\"MappingDataFlow\",\"typeProperties\":{\"sources\":[{\"schemaLinkedService\":{\"referenceName\":\"wdyjqurykcrrauee\",\"parameters\":{\"cbcbgydlqidy\":\"datauehogdd\"}},\"name\":\"mhmpty\",\"description\":\"lkfbnrqqxvztpb\",\"dataset\":{\"referenceName\":\"nqtxjtomalswbnf\",\"parameters\":{\"qjn\":\"datapld\"}},\"linkedService\":{\"referenceName\":\"zygleexahvm\",\"parameters\":{\"sjjzyvoaqajuveh\":\"datasbrcary\",\"be\":\"dataptdmkrrbhmpful\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"bpmfbfununmpzkrv\",\"datasetParameters\":\"dataifkdschlzvf\",\"parameters\":{\"rtogmhmj\":\"datankjjwgcwnphbkgf\",\"fp\":\"datajsc\",\"fv\":\"dataqwtygevgwmseharx\",\"x\":\"datan\"},\"\":{\"wjhrsidqpxlbtpa\":\"datapjptn\",\"ngatwmy\":\"dataf\",\"mfjhpycvjqdvdwkq\":\"datayutrymd\",\"n\":\"dataldrlefgnaavua\"}}},{\"schemaLinkedService\":{\"referenceName\":\"taoutnpdct\",\"parameters\":{\"y\":\"datapfe\",\"tybkcgs\":\"datahduyeuyldph\",\"x\":\"datathhllnmwyne\",\"fciatxtjrr\":\"datax\"}},\"name\":\"kmdskjhhxd\",\"description\":\"jfoxcxscvslxl\",\"dataset\":{\"referenceName\":\"a\",\"parameters\":{\"yjmkxettc\":\"datamuk\",\"xjhqxcsqhtkb\":\"datalojfkqidnqto\",\"dmbi\":\"datanqlrng\",\"qkzn\":\"datapsnaww\"}},\"linkedService\":{\"referenceName\":\"hllxricctkw\",\"parameters\":{\"xhdctrceqnk\":\"dataqoajxeiyglesrwva\",\"lj\":\"datarupobehd\",\"bibnzpphepifex\":\"dataacvumepj\",\"cjclykcgxv\":\"dataeqir\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"lvczu\",\"datasetParameters\":\"dataac\",\"parameters\":{\"koynuiylpckae\":\"dataettepdjxqe\",\"nzhctmjtsgh\":\"datasedveskwxegqphrg\",\"rpzeqac\":\"databcbcpz\",\"zshnuqndaizup\":\"dataldtzmpypefcp\"},\"\":{\"gw\":\"datauytuszxhmtvtv\",\"haokgkskjiv\":\"dataiukvzwydwt\"}}},{\"schemaLinkedService\":{\"referenceName\":\"shajqf\",\"parameters\":{\"hwu\":\"dataeexpgeumi\",\"dbzsx\":\"datatrdexyionofnin\",\"bzbcyksiv\":\"datawqqrsmpcbbprtuga\",\"rftsjcwjjxs\":\"datafogdrtbfcm\"}},\"name\":\"mb\",\"description\":\"vifdxkecifhocjx\",\"dataset\":{\"referenceName\":\"loozrvt\",\"parameters\":{\"cpxxvirye\":\"datamufun\",\"lpmcrdc\":\"datangjgvrquvpyg\",\"x\":\"dataeljtiahxmfqryarv\"}},\"linkedService\":{\"referenceName\":\"bglcjkayspthzodu\",\"parameters\":{\"djxyxgbkkqvjcteo\":\"datamjtgblioskkfmkm\",\"pxvjnzd\":\"datadlrslskk\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"cojhpcnabx\",\"datasetParameters\":\"datasnggytexvzilmhiv\",\"parameters\":{\"cknrzda\":\"dataww\",\"eucyrth\":\"datalskzptjxul\"},\"\":{\"n\":\"dataehmcgcje\",\"qnttmbq\":\"dataehokamvfej\",\"kpysthhzagjf\":\"dataabzfivf\",\"ejgvkvebaqszllrz\":\"datayyrlhgenu\"}}}],\"sinks\":[{\"schemaLinkedService\":{\"referenceName\":\"dqgmih\",\"parameters\":{\"inklogxs\":\"datamcqrhnxt\",\"bjwzzos\":\"datatzarhzvqnsqktc\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"kybtglwkzpgajsqj\",\"parameters\":{\"uqrebluimmbwx\":\"dataqbmfuvqarwz\",\"kraokq\":\"datafgtdmbvx\",\"aokbavlyttaaknwf\":\"databudbt\"}},\"name\":\"ke\",\"description\":\"mhpdu\",\"dataset\":{\"referenceName\":\"igatolekscbctna\",\"parameters\":{\"dpkawnsnl\":\"datamwbzxpdc\",\"bicziuswswj\":\"dataimouxwksqmudmfco\",\"fwbivqvo\":\"datakbqsjhbtqqvyfscy\",\"wvbhlimbyq\":\"datafuy\"}},\"linkedService\":{\"referenceName\":\"r\",\"parameters\":{\"asaxxo\":\"datalikcdrd\",\"kwiy\":\"datasm\",\"ukosrn\":\"datav\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"vzmlnkoywsxv\",\"datasetParameters\":\"databjqqaxuyvymcn\",\"parameters\":{\"wxqweuipmpvksmi\":\"datadoabhj\",\"krdpqgfhyrfr\":\"datansqxtltc\",\"rcwfcmfcnrjajq\":\"datakkld\",\"zqgxx\":\"dataatxjtiel\"},\"\":{\"prnzc\":\"databmtlpqagyno\",\"ryqxzxa\":\"datalin\",\"mqimiymqru\":\"datazi\",\"asvvoqsbpkfl\":\"dataguhfupe\"}}},{\"schemaLinkedService\":{\"referenceName\":\"fkg\",\"parameters\":{\"puohdkcprgukxrz\":\"dataaowuzo\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"ochlu\",\"parameters\":{\"izcbfzmcrunfhiuc\":\"datamqrud\",\"u\":\"datamfbcpaqktkrum\",\"kxiuxqggvqr\":\"datadkyzbfvxov\"}},\"name\":\"hyhlwcjsqg\",\"description\":\"hffbxrq\",\"dataset\":{\"referenceName\":\"ijpeuql\",\"parameters\":{\"swenawwa\":\"dataeqztvxwmwwm\"}},\"linkedService\":{\"referenceName\":\"cleqioulndhzyo\",\"parameters\":{\"llhsvidmyt\":\"dataht\",\"glxpnovyoanfbcsw\":\"datal\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"ywv\",\"datasetParameters\":\"dataigvjrktp\",\"parameters\":{\"mwhqnucsklh\":\"dataukyawoh\",\"sjt\":\"datai\"},\"\":{\"uoeedwjcci\":\"databninjgazlsvbzfc\",\"yehqbeivdlhydwb\":\"datalhsyekrdrenxolr\",\"mpathubtah\":\"databfgrlpunytjlkes\",\"niiwllbvgwz\":\"datae\"}}},{\"schemaLinkedService\":{\"referenceName\":\"ft\",\"parameters\":{\"ktjtgra\":\"dataus\",\"fkbebauzl\":\"dataaqo\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"txxwpfh\",\"parameters\":{\"oywhczzqrhmngqbe\":\"dataudrtpzkgme\",\"nykdi\":\"dataygisrz\"}},\"name\":\"jch\",\"description\":\"mpwctoflds\",\"dataset\":{\"referenceName\":\"cdhz\",\"parameters\":{\"ewhfjsrwqrxetf\":\"databrfgdrwji\",\"r\":\"datacwv\",\"ax\":\"datadqntycnawthv\"}},\"linkedService\":{\"referenceName\":\"u\",\"parameters\":{\"k\":\"datamcmhudfjeceh\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"qtwloes\",\"datasetParameters\":\"dataggvrbnyrukoilaci\",\"parameters\":{\"lh\":\"datajleip\",\"whbgxvellvul\":\"datayxpzruzythqk\"},\"\":{\"vm\":\"datamnitmujd\"}}},{\"schemaLinkedService\":{\"referenceName\":\"yymffhmjp\",\"parameters\":{\"zuvrzmzqmz\":\"datayx\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"rb\",\"parameters\":{\"tjpp\":\"datanmdyfoebo\",\"t\":\"datalaohoqkp\",\"lmhxdqaolfylnk\":\"dataqjilaywkdcwmqsyr\"}},\"name\":\"bjpjvlyw\",\"description\":\"mfwo\",\"dataset\":{\"referenceName\":\"jw\",\"parameters\":{\"nqzocrdzg\":\"datayj\",\"xdncaqtt\":\"datazeunt\",\"gyrihlgm\":\"dataekoifuvnyttzgi\",\"lkndrndpgfjodh\":\"databehlqtxnr\"}},\"linkedService\":{\"referenceName\":\"qotwfh\",\"parameters\":{\"zafczuumljci\":\"datawgsabvcipo\",\"veitit\":\"datavpefyc\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"xzajlnsjhwjuyxxb\",\"datasetParameters\":\"datavmv\",\"parameters\":{\"pntghyks\":\"datatuadxkxeqb\",\"t\":\"datarcdrnxsluvlzlad\",\"rhwzdanojisg\":\"datakpbqhvfdqqjw\",\"ztjctibpvbkae\":\"datalmvokat\"},\"\":{\"dfwakwseivmak\":\"datamzy\"}}}],\"transformations\":[{\"name\":\"so\",\"description\":\"juxlkbectvtfjm\",\"dataset\":{\"referenceName\":\"dchmaiubavlz\",\"parameters\":{\"jqafkmkro\":\"datagmfalkzazmgoked\",\"pqrtvaoznqni\":\"datazrthqet\",\"eituugedhfpjs\":\"dataiezeagm\",\"syjdeolctae\":\"datalzmb\"}},\"linkedService\":{\"referenceName\":\"syrled\",\"parameters\":{\"xzvsgeafgf\":\"datastbvtqig\",\"kkwa\":\"datasehxlzsxezp\",\"yfjlpzeqto\":\"dataes\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"lixlajmllpque\",\"datasetParameters\":\"dataam\",\"parameters\":{\"mkekxpkzwaqxo\":\"datagwb\"},\"\":{\"fidusztekxbyjgm\":\"datavchiqbpl\",\"hrdicxdwyjfo\":\"datafepxyihpqadag\",\"ukdveksbuhoduc\":\"dataxwyovcxjsgbip\",\"scrdp\":\"datav\"}}},{\"name\":\"bfdyjduss\",\"description\":\"szekbh\",\"dataset\":{\"referenceName\":\"kaaggkreh\",\"parameters\":{\"ybff\":\"datan\",\"sqtaadusrexxfa\":\"datajfiimreoa\",\"psimsf\":\"datasqwudohzilfmnli\"}},\"linkedService\":{\"referenceName\":\"pofqpmbhy\",\"parameters\":{\"erhsmvgohtw\":\"datadrmmttjxoph\",\"wwmhkruwae\":\"datamqilrixysfnimsqy\",\"in\":\"datarympmlq\",\"njdiqfliejhpcl\":\"datazduewihapfjii\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"dfsbwceivb\",\"datasetParameters\":\"dataipbwxgooo\",\"parameters\":{\"s\":\"datarad\",\"g\":\"dataxknpdgz\",\"wwnbafoctohz\":\"datasugswhgsaod\",\"hoadhrsxqvzv\":\"dataaquvwsxbgnvkervq\"},\"\":{\"klrxhjnltce\":\"databdsrgfajglzrsu\",\"ie\":\"datajdvqy\"}}}],\"script\":\"kw\",\"scriptLines\":[\"wdxvqzxoebwg\",\"xbibanbaupw\",\"zvpaklozkxbzrpej\",\"lssan\"]},\"description\":\"ttkgsux\",\"annotations\":[\"dataswgkpjhboyikebh\",\"datahkslgwlokhueoij\",\"datazcqypzqzufgsyf\",\"datajyvdwtfxptpqayam\"],\"folder\":{\"name\":\"fgybmxs\"}}")
                .toObject(MappingDataFlow.class);
        Assertions.assertEquals("ttkgsux", model.description());
        Assertions.assertEquals("fgybmxs", model.folder().name());
        Assertions.assertEquals("mhmpty", model.sources().get(0).name());
        Assertions.assertEquals("lkfbnrqqxvztpb", model.sources().get(0).description());
        Assertions.assertEquals("nqtxjtomalswbnf", model.sources().get(0).dataset().referenceName());
        Assertions.assertEquals("zygleexahvm", model.sources().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sources().get(0).flowlet().type());
        Assertions.assertEquals("bpmfbfununmpzkrv", model.sources().get(0).flowlet().referenceName());
        Assertions.assertEquals("wdyjqurykcrrauee", model.sources().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("ke", model.sinks().get(0).name());
        Assertions.assertEquals("mhpdu", model.sinks().get(0).description());
        Assertions.assertEquals("igatolekscbctna", model.sinks().get(0).dataset().referenceName());
        Assertions.assertEquals("r", model.sinks().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sinks().get(0).flowlet().type());
        Assertions.assertEquals("vzmlnkoywsxv", model.sinks().get(0).flowlet().referenceName());
        Assertions.assertEquals("dqgmih", model.sinks().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("kybtglwkzpgajsqj", model.sinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("so", model.transformations().get(0).name());
        Assertions.assertEquals("juxlkbectvtfjm", model.transformations().get(0).description());
        Assertions.assertEquals("dchmaiubavlz", model.transformations().get(0).dataset().referenceName());
        Assertions.assertEquals("syrled", model.transformations().get(0).linkedService().referenceName());
        Assertions
            .assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.transformations().get(0).flowlet().type());
        Assertions.assertEquals("lixlajmllpque", model.transformations().get(0).flowlet().referenceName());
        Assertions.assertEquals("kw", model.script());
        Assertions.assertEquals("wdxvqzxoebwg", model.scriptLines().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MappingDataFlow model =
            new MappingDataFlow()
                .withDescription("ttkgsux")
                .withAnnotations(
                    Arrays
                        .asList(
                            "dataswgkpjhboyikebh", "datahkslgwlokhueoij", "datazcqypzqzufgsyf", "datajyvdwtfxptpqayam"))
                .withFolder(new DataFlowFolder().withName("fgybmxs"))
                .withSources(
                    Arrays
                        .asList(
                            new DataFlowSource()
                                .withName("mhmpty")
                                .withDescription("lkfbnrqqxvztpb")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("nqtxjtomalswbnf")
                                        .withParameters(mapOf("qjn", "datapld")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("zygleexahvm")
                                        .withParameters(
                                            mapOf("sjjzyvoaqajuveh", "datasbrcary", "be", "dataptdmkrrbhmpful")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("bpmfbfununmpzkrv")
                                        .withDatasetParameters("dataifkdschlzvf")
                                        .withParameters(
                                            mapOf(
                                                "rtogmhmj",
                                                "datankjjwgcwnphbkgf",
                                                "fp",
                                                "datajsc",
                                                "fv",
                                                "dataqwtygevgwmseharx",
                                                "x",
                                                "datan"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("wdyjqurykcrrauee")
                                        .withParameters(mapOf("cbcbgydlqidy", "datauehogdd"))),
                            new DataFlowSource()
                                .withName("kmdskjhhxd")
                                .withDescription("jfoxcxscvslxl")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("a")
                                        .withParameters(
                                            mapOf(
                                                "yjmkxettc",
                                                "datamuk",
                                                "xjhqxcsqhtkb",
                                                "datalojfkqidnqto",
                                                "dmbi",
                                                "datanqlrng",
                                                "qkzn",
                                                "datapsnaww")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("hllxricctkw")
                                        .withParameters(
                                            mapOf(
                                                "xhdctrceqnk",
                                                "dataqoajxeiyglesrwva",
                                                "lj",
                                                "datarupobehd",
                                                "bibnzpphepifex",
                                                "dataacvumepj",
                                                "cjclykcgxv",
                                                "dataeqir")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("lvczu")
                                        .withDatasetParameters("dataac")
                                        .withParameters(
                                            mapOf(
                                                "koynuiylpckae",
                                                "dataettepdjxqe",
                                                "nzhctmjtsgh",
                                                "datasedveskwxegqphrg",
                                                "rpzeqac",
                                                "databcbcpz",
                                                "zshnuqndaizup",
                                                "dataldtzmpypefcp"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("taoutnpdct")
                                        .withParameters(
                                            mapOf(
                                                "y",
                                                "datapfe",
                                                "tybkcgs",
                                                "datahduyeuyldph",
                                                "x",
                                                "datathhllnmwyne",
                                                "fciatxtjrr",
                                                "datax"))),
                            new DataFlowSource()
                                .withName("mb")
                                .withDescription("vifdxkecifhocjx")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("loozrvt")
                                        .withParameters(
                                            mapOf(
                                                "cpxxvirye",
                                                "datamufun",
                                                "lpmcrdc",
                                                "datangjgvrquvpyg",
                                                "x",
                                                "dataeljtiahxmfqryarv")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("bglcjkayspthzodu")
                                        .withParameters(
                                            mapOf(
                                                "djxyxgbkkqvjcteo", "datamjtgblioskkfmkm", "pxvjnzd", "datadlrslskk")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("cojhpcnabx")
                                        .withDatasetParameters("datasnggytexvzilmhiv")
                                        .withParameters(mapOf("cknrzda", "dataww", "eucyrth", "datalskzptjxul"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("shajqf")
                                        .withParameters(
                                            mapOf(
                                                "hwu",
                                                "dataeexpgeumi",
                                                "dbzsx",
                                                "datatrdexyionofnin",
                                                "bzbcyksiv",
                                                "datawqqrsmpcbbprtuga",
                                                "rftsjcwjjxs",
                                                "datafogdrtbfcm")))))
                .withSinks(
                    Arrays
                        .asList(
                            new DataFlowSink()
                                .withName("ke")
                                .withDescription("mhpdu")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("igatolekscbctna")
                                        .withParameters(
                                            mapOf(
                                                "dpkawnsnl",
                                                "datamwbzxpdc",
                                                "bicziuswswj",
                                                "dataimouxwksqmudmfco",
                                                "fwbivqvo",
                                                "datakbqsjhbtqqvyfscy",
                                                "wvbhlimbyq",
                                                "datafuy")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("r")
                                        .withParameters(
                                            mapOf("asaxxo", "datalikcdrd", "kwiy", "datasm", "ukosrn", "datav")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("vzmlnkoywsxv")
                                        .withDatasetParameters("databjqqaxuyvymcn")
                                        .withParameters(
                                            mapOf(
                                                "wxqweuipmpvksmi",
                                                "datadoabhj",
                                                "krdpqgfhyrfr",
                                                "datansqxtltc",
                                                "rcwfcmfcnrjajq",
                                                "datakkld",
                                                "zqgxx",
                                                "dataatxjtiel"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("dqgmih")
                                        .withParameters(
                                            mapOf("inklogxs", "datamcqrhnxt", "bjwzzos", "datatzarhzvqnsqktc")))
                                .withRejectedDataLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("kybtglwkzpgajsqj")
                                        .withParameters(
                                            mapOf(
                                                "uqrebluimmbwx",
                                                "dataqbmfuvqarwz",
                                                "kraokq",
                                                "datafgtdmbvx",
                                                "aokbavlyttaaknwf",
                                                "databudbt"))),
                            new DataFlowSink()
                                .withName("hyhlwcjsqg")
                                .withDescription("hffbxrq")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("ijpeuql")
                                        .withParameters(mapOf("swenawwa", "dataeqztvxwmwwm")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("cleqioulndhzyo")
                                        .withParameters(mapOf("llhsvidmyt", "dataht", "glxpnovyoanfbcsw", "datal")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("ywv")
                                        .withDatasetParameters("dataigvjrktp")
                                        .withParameters(mapOf("mwhqnucsklh", "dataukyawoh", "sjt", "datai"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("fkg")
                                        .withParameters(mapOf("puohdkcprgukxrz", "dataaowuzo")))
                                .withRejectedDataLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("ochlu")
                                        .withParameters(
                                            mapOf(
                                                "izcbfzmcrunfhiuc",
                                                "datamqrud",
                                                "u",
                                                "datamfbcpaqktkrum",
                                                "kxiuxqggvqr",
                                                "datadkyzbfvxov"))),
                            new DataFlowSink()
                                .withName("jch")
                                .withDescription("mpwctoflds")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("cdhz")
                                        .withParameters(
                                            mapOf(
                                                "ewhfjsrwqrxetf",
                                                "databrfgdrwji",
                                                "r",
                                                "datacwv",
                                                "ax",
                                                "datadqntycnawthv")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("u")
                                        .withParameters(mapOf("k", "datamcmhudfjeceh")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("qtwloes")
                                        .withDatasetParameters("dataggvrbnyrukoilaci")
                                        .withParameters(mapOf("lh", "datajleip", "whbgxvellvul", "datayxpzruzythqk"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("ft")
                                        .withParameters(mapOf("ktjtgra", "dataus", "fkbebauzl", "dataaqo")))
                                .withRejectedDataLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("txxwpfh")
                                        .withParameters(
                                            mapOf("oywhczzqrhmngqbe", "dataudrtpzkgme", "nykdi", "dataygisrz"))),
                            new DataFlowSink()
                                .withName("bjpjvlyw")
                                .withDescription("mfwo")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("jw")
                                        .withParameters(
                                            mapOf(
                                                "nqzocrdzg",
                                                "datayj",
                                                "xdncaqtt",
                                                "datazeunt",
                                                "gyrihlgm",
                                                "dataekoifuvnyttzgi",
                                                "lkndrndpgfjodh",
                                                "databehlqtxnr")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("qotwfh")
                                        .withParameters(
                                            mapOf("zafczuumljci", "datawgsabvcipo", "veitit", "datavpefyc")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("xzajlnsjhwjuyxxb")
                                        .withDatasetParameters("datavmv")
                                        .withParameters(
                                            mapOf(
                                                "pntghyks",
                                                "datatuadxkxeqb",
                                                "t",
                                                "datarcdrnxsluvlzlad",
                                                "rhwzdanojisg",
                                                "datakpbqhvfdqqjw",
                                                "ztjctibpvbkae",
                                                "datalmvokat"))
                                        .withAdditionalProperties(mapOf()))
                                .withSchemaLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("yymffhmjp")
                                        .withParameters(mapOf("zuvrzmzqmz", "datayx")))
                                .withRejectedDataLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("rb")
                                        .withParameters(
                                            mapOf(
                                                "tjpp",
                                                "datanmdyfoebo",
                                                "t",
                                                "datalaohoqkp",
                                                "lmhxdqaolfylnk",
                                                "dataqjilaywkdcwmqsyr")))))
                .withTransformations(
                    Arrays
                        .asList(
                            new Transformation()
                                .withName("so")
                                .withDescription("juxlkbectvtfjm")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("dchmaiubavlz")
                                        .withParameters(
                                            mapOf(
                                                "jqafkmkro",
                                                "datagmfalkzazmgoked",
                                                "pqrtvaoznqni",
                                                "datazrthqet",
                                                "eituugedhfpjs",
                                                "dataiezeagm",
                                                "syjdeolctae",
                                                "datalzmb")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("syrled")
                                        .withParameters(
                                            mapOf(
                                                "xzvsgeafgf",
                                                "datastbvtqig",
                                                "kkwa",
                                                "datasehxlzsxezp",
                                                "yfjlpzeqto",
                                                "dataes")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("lixlajmllpque")
                                        .withDatasetParameters("dataam")
                                        .withParameters(mapOf("mkekxpkzwaqxo", "datagwb"))
                                        .withAdditionalProperties(mapOf())),
                            new Transformation()
                                .withName("bfdyjduss")
                                .withDescription("szekbh")
                                .withDataset(
                                    new DatasetReference()
                                        .withReferenceName("kaaggkreh")
                                        .withParameters(
                                            mapOf(
                                                "ybff",
                                                "datan",
                                                "sqtaadusrexxfa",
                                                "datajfiimreoa",
                                                "psimsf",
                                                "datasqwudohzilfmnli")))
                                .withLinkedService(
                                    new LinkedServiceReference()
                                        .withReferenceName("pofqpmbhy")
                                        .withParameters(
                                            mapOf(
                                                "erhsmvgohtw",
                                                "datadrmmttjxoph",
                                                "wwmhkruwae",
                                                "datamqilrixysfnimsqy",
                                                "in",
                                                "datarympmlq",
                                                "njdiqfliejhpcl",
                                                "datazduewihapfjii")))
                                .withFlowlet(
                                    new DataFlowReference()
                                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                                        .withReferenceName("dfsbwceivb")
                                        .withDatasetParameters("dataipbwxgooo")
                                        .withParameters(
                                            mapOf(
                                                "s",
                                                "datarad",
                                                "g",
                                                "dataxknpdgz",
                                                "wwnbafoctohz",
                                                "datasugswhgsaod",
                                                "hoadhrsxqvzv",
                                                "dataaquvwsxbgnvkervq"))
                                        .withAdditionalProperties(mapOf()))))
                .withScript("kw")
                .withScriptLines(Arrays.asList("wdxvqzxoebwg", "xbibanbaupw", "zvpaklozkxbzrpej", "lssan"));
        model = BinaryData.fromObject(model).toObject(MappingDataFlow.class);
        Assertions.assertEquals("ttkgsux", model.description());
        Assertions.assertEquals("fgybmxs", model.folder().name());
        Assertions.assertEquals("mhmpty", model.sources().get(0).name());
        Assertions.assertEquals("lkfbnrqqxvztpb", model.sources().get(0).description());
        Assertions.assertEquals("nqtxjtomalswbnf", model.sources().get(0).dataset().referenceName());
        Assertions.assertEquals("zygleexahvm", model.sources().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sources().get(0).flowlet().type());
        Assertions.assertEquals("bpmfbfununmpzkrv", model.sources().get(0).flowlet().referenceName());
        Assertions.assertEquals("wdyjqurykcrrauee", model.sources().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("ke", model.sinks().get(0).name());
        Assertions.assertEquals("mhpdu", model.sinks().get(0).description());
        Assertions.assertEquals("igatolekscbctna", model.sinks().get(0).dataset().referenceName());
        Assertions.assertEquals("r", model.sinks().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sinks().get(0).flowlet().type());
        Assertions.assertEquals("vzmlnkoywsxv", model.sinks().get(0).flowlet().referenceName());
        Assertions.assertEquals("dqgmih", model.sinks().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("kybtglwkzpgajsqj", model.sinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("so", model.transformations().get(0).name());
        Assertions.assertEquals("juxlkbectvtfjm", model.transformations().get(0).description());
        Assertions.assertEquals("dchmaiubavlz", model.transformations().get(0).dataset().referenceName());
        Assertions.assertEquals("syrled", model.transformations().get(0).linkedService().referenceName());
        Assertions
            .assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.transformations().get(0).flowlet().type());
        Assertions.assertEquals("lixlajmllpque", model.transformations().get(0).flowlet().referenceName());
        Assertions.assertEquals("kw", model.script());
        Assertions.assertEquals("wdxvqzxoebwg", model.scriptLines().get(0));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
