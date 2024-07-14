package com.absarhan.muslimbro;

import com.absarhan.muslimbro.model.Azkar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class app {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DefaultPersistenceUnit");
        EntityManager entityManager = factory.createEntityManager();

        Azkar azkar1 = new Azkar("morning", "اللّهُ لاَ إِلٰهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الأَرْضِ مَن ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَلاَ يُحِيطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلاَّ بِمَا شَاء وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالأَرْضَ وَلاَ يَؤُودُهُ حِفْظُهُمَا وَهُوَ الْعَلِيُّ الْعَظِيمُ.", "Allahu la ilaha illa huwa, al-hayyu al-qayyum, la ta’khudhuhu sinatun wa la nawm, lahu ma fi as-samawati wa ma fi al-ard, man dha allathee yashfa’u ‘indahu illa bi-idhnihi, ya’lamu ma bayna aydihim wa ma khalfahum, wa la yuhituna bishay-in min ‘ilmihi illa bima sha’a, wasi’a kursiyyuhu as-samawati wa al-ard, wa la ya’uduhu hifzuhuma wa huwa al-‘aliyyu al-‘azim.", "Allah! Non c'è altro dio che Lui, il Vivente, l'Assoluto. Non lo prendono né sonno né sonnolenza. A Lui appartiene ciò che è nei cieli e ciò che è sulla terra. Chi intercederà presso di Lui senza il Suo permesso? Conosce ciò che è davanti a loro e ciò che è dietro di loro, e non abbracciano nulla della Sua scienza se non ciò che Egli vuole. Il Suo trono si estende sui cieli e sulla terra, e non li affatica custodirli, ed Egli è l'Altissimo, l'Immenso. (Surah Al-Baqara, 2:255 - Ayat al-Kursi)\n", 1);
        Azkar azkar2 = new Azkar("morning", "قُلْ هُوَ ٱللَّهُ أَحَدٌ ٱللَّهُ ٱلصَّمَدُ لَمْ يَلِدْ وَلَمْ يُولَدْ وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌۢ.", "Qul huwa Allahu ahad, Allahu assamad, lam yalid wa lam yulad, wa lam yakun lahu kufuwan ahad.", "Dì: Egli, Allah, è Unico, Allah è l'Assoluto. Non ha generato, né è stato generato, e nessuno è eguale a Lui. (Surah Al-Ikhlas, 112)\n", 3);
        Azkar azkar3 = new Azkar("morning", "قُلْ أَعُوذُ بِرَبِّ ٱلْفَلَقِ مِن شَرِّ مَا خَلَقَ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ وَمِن شَرِّ ٱلنَّفَّـٰثَـٰتِ فِى ٱلْعُقَدِ وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ.", "Qul a'udhu birabbi al-falaq, min sharri ma khalaq, wa min sharri ghasiqin idha waqab, wa min sharri an-naffathati fi al-'uqad, wa min sharri hasidin idha hasad.", "Dì: Mi rifugio nel Signore dell'alba nascente, dal male di quanto Egli ha creato, dal male di una notte profonda quando diventa oscura, dal male di chi soffia sui nodi, dal male dell'invidioso quando invidia. (Surah Al-Falaq, 113)", 3);
        Azkar azkar4 = new Azkar("morning", "قُلْ أَعُوذُ بِرَبِّ ٱلنَّاسِ مَلِكِ ٱلنَّاسِ إِلَـٰهِ ٱلنَّاسِ مِن شَرِّ ٱلْوَسْوَاسِ ٱلْخَنَّاسِ ٱلَّذِى يُوَسْوِسُ فِى صُدُورِ ٱلنَّاسِ مِنَ ٱلْجِنَّةِ وَٱلنَّاسِ.", "Qul a'udhu birabbi an-nas, maliki an-nas, ilahi an-nas, min sharri al-waswas al-khannas, allathee yuwaswisu fi suduri an-nas, mina al-jinnati wa an-nas.", "Dì: Mi rifugio nel Signore degli uomini, nel Sovrano degli uomini, nel Dio degli uomini, dal male del sussurratore furtivo che sussurra nei cuori degli uomini, tra i jinn e tra gli uomini. (Surah An-Nas, 114)\n", 3);
        Azkar azkar5 = new Azkar("morning", "اللهم أنت ربي لا إله إلا أنت، خلقتني وأنا عبدك، وأنا على عهدك ووعدك ما استطعت، أعوذ بك من شر ما صنعت، أبوء لك بنعمتك علي، وأبوء بذنبي فاغفر لي، فإنه لا يغفر الذنوب إلا أنت.", "Allahumma anta rabbi, la ilaha illa anta, khalaqtani wa ana ‘abduka, wa ana ‘ala ‘ahdika wa wa’dika ma istata’tu, a’udhu bika min sharri ma sana’tu, abu’u laka bini’matika ‘alayya, wa abu’u bidhambi faghfirli, fa innahu la yaghfiru adh-dhunuba illa anta.", "O Allah, Tu sei il mio Signore, non c'è altro dio all'infuori di Te. Tu mi hai creato e io sono il Tuo servo, e cerco di mantenere la Tua promessa e il Tuo patto per quanto posso. Mi rifugio in Te dal male che ho commesso. Riconosco le Tue benedizioni su di me e riconosco il mio peccato. Perdonami, perché nessuno può perdonare i peccati tranne Te.", 1);
        Azkar azkar6 = new Azkar("morning", "اللهم بك أصبحنا، وبك أمسينا، وبك نحيا، وبك نموت، وإليك النشور.", "Allahumma bika asbahna, wa bika amsayna, wa bika nahya, wa bika namutu, wa ilayka an-nushur.", "O Allah, con il Tuo permesso ci siamo svegliati e con il Tuo permesso ci addormentiamo. Con il Tuo permesso viviamo e con il Tuo permesso moriamo, e a Te è la resurrezione.", 1);
        Azkar azkar7 = new Azkar("morning", "اللهم إني أصبحت أشهدك وأشهد حملة عرشك وملائكتك وجميع خلقك أنك أنت الله لا إله إلا أنت، وحدك لا شريك لك، وأن محمداً عبدك ورسولك.", "Allahumma inni asbahtu ushhiduka wa ushhidu hamalata ‘arshika wa mala’ikatika wa jamee’a khalqika annaka anta Allah la ilaha illa anta wahdaka la shareeka lak, wa anna Muhammadan ‘abduka wa rasuluk.", "O Allah, questa mattina faccio testimonianza a Te, ai portatori del Tuo trono, ai Tuoi angeli e a tutta la Tua creazione che Tu sei Allah e non c'è altro dio all'infuori di Te. Sei Unico, non hai associati, e che Muhammad è il Tuo servo e messaggero.", 4);
        Azkar azkar8 = new Azkar("morning", "حَسْبِيَ اللهُ لاَ إِلٰهَ إِلاَّ هُوَ عَلَيْهِ تَوَكَّلْتُ وَهُوَ رَبُّ الْعَرْشِ الْعَظِيمِ.", "Hasbiya Allahu la ilaha illa huwa ‘alayhi tawakkaltu wa huwa rabbu al-‘arsh al-‘azim.", "Allah mi basta, non c'è altro dio all'infuori di Lui. In Lui ripongo la mia fiducia, ed Egli è il Signore del trono immenso.", 7);
        Azkar azkar9 = new Azkar("morning", "بِسْمِ اللهِ الَّذِي لاَ يَضُرُّ مَعَ اسْمِهِ شَيْءٌ فِي الأَرْضِ وَلاَ فِي السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ.", "Bismillah alladhi la yadurru ma’asmihi shay’un fi al-ard wa la fi as-sama’ wa huwa as-sami’ al-‘alim.", "Nel nome di Allah, con il cui nome nulla può recare danno né sulla terra né nei cieli, ed Egli è l’Audiente, l’Onnisciente.", 3);
        Azkar azkar10 = new Azkar("morning", "رَضِيتُ بِاللهِ رَبًّا وَبِالإِسْلاَمِ دِينًا وَبِمُحَمَّدٍ نَبِيًّا.", "Radeetu billahi rabban wa bil-islami dinan wa bi-Muhammadin nabiyya.", "Sono soddisfatto di Allah come mio Signore, dell’Islam come mia religione e di Muhammad come mio profeta.", 3);
        Azkar azkar11 = new Azkar("morning", "اللَّهُمَّ إِنِّي أَسْأَلُكَ خَيْرَ الْيَوْمِ، وَخَيْرَ مَا بَعْدَهُ، وَأَعُوذُ بِكَ مِنْ شَرِّهِ وَشَرِّ مَا بَعْدَهُ.", "Allahumma inni as-aluka khayra al-yawmi, wa khayra ma ba'dahu, wa a'udhu bika min sharrihi wa sharri ma ba'dahu.", "O Allah, Ti chiedo il bene di questo giorno, il bene che segue e cerco rifugio in Te dal suo male e dal male che segue.", 1);
        Azkar azkar12 = new Azkar("morning", "يَا حَيُّ يَا قَيُّومُ، بِرَحْمَتِكَ أَسْتَغِيثُ، أَصْلِحْ لِي شَأْنِي كُلَّهُ وَلاَ تَكِلْنِي إِلَى نَفْسِي طَرْفَةَ عَيْنٍ.", "Ya Hayyu Ya Qayyum, bi-rahmatika astagheeth, aslih li sha’ni kullahu wa la takilni ila nafsi tarfata ‘ayn.", "O il Vivente, il Sostenitore, con la Tua misericordia cerco aiuto, rettifica per me tutti i miei affari e non lasciarmi alla mercé di me stesso neanche per un batter d'occhio.", 1);
        Azkar azkar13 = new Azkar("morning", "اللهم عافني في بدني، اللهم عافني في سمعي، اللهم عافني في بصري، لا إله إلا أنت، اللهم إني أعوذ بك من الكفر والفقر، اللهم إني أعوذ بك من عذاب القبر، لا إله إلا أنت.", "Allahumma ‘afini fi badani, Allahumma ‘afini fi sam’i, Allahumma ‘afini fi basari, la ilaha illa anta. Allahumma inni a’udhu bika min al-kufri wal-faqri, Allahumma inni a’udhu bika min ‘adhabi al-qabri, la ilaha illa anta.", "O Allah, concedimi la salute nel mio corpo. O Allah, concedimi la salute nel mio udito. O Allah, concedimi la salute nella mia vista. Non c'è altro dio all'infuori di Te. O Allah, cerco rifugio in Te dal non credere e dalla povertà. O Allah, cerco rifugio in Te dal tormento della tomba. Non c'è altro dio all'infuori di Te.", 3);
        Azkar azkar14 = new Azkar("morning", "أَصْبَحْنَا عَلَى فِطْرَةِ الإِسْلاَمِ، وَعَلَى كَلِمَةِ الإِخْلاَصِ، وَعَلَى دِينِ نَبِيِّنَا مُحَمَّدٍ صلى الله عليه وسلم، وَعَلَى مِلَّةِ أَبِينَا إِبْرَاهِيمَ حَنِيفًا مُسْلِمًا، وَمَا كَانَ مِنَ الْمُشْرِكِينَ.", "Asbahna 'ala fitrati al-Islam, wa 'ala kalimati al-ikhlas, wa 'ala dinin nabiyyina Muhammadin sallallahu 'alayhi wa sallam, wa 'ala millati abina Ibrahim hanifan musliman, wa ma kana min al-mushrikin.", "Siamo svegliati secondo la natura dell'Islam, sulla parola della sincerità, sulla religione del nostro Profeta Muhammad, pace e benedizioni su di lui, sulla millah del nostro padre Ibrahim, che era un hanif, un musulmano, e non era tra i politeisti.", 1);
        Azkar azkar15 = new Azkar("morning", "اللّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لَا إِلَهَ إِلَّا أَنْتَ.", "Allahumma inni a'udhu bika min al-kufri wa al-faqri, wa a'udhu bika min 'adhabi al-qabri, la ilaha illa anta.", "O Allah, cerco rifugio in Te dal non credere e dalla povertà, e cerco rifugio in Te dal tormento della tomba. Non c'è altro dio all'infuori di Te.", 1);
        Azkar azkar16 = new Azkar("morning", "اللَّهُمَّ إِنِّي أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً.", "Allahumma inni as-aluka 'ilman nafi'an, wa rizqan tayyiban, wa 'amalan mutaqabbalan.", "O Allah, Ti chiedo conoscenza utile, sostentamento puro e azioni accettate.", 3);
        Azkar azkar17 = new Azkar("morning", "سُبْحَانَ اللهِ وَبِحَمْدِهِ.", "SubhanAllahi wa bihamdihi.", "Gloria e lode ad Allah.", 100);

        // Azkar della sera
        Azkar azkar18 = new Azkar("evening", "بِسْمِ اللَّهِ الَّذِي لَا يَضُرُّ مَعَ اسْمِهِ شَيْءٌ فِي الْأَرْضِ وَلَا فِي السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ.", "Bismillah alladhi la yadurru ma’asmihi shay’un fi al-ard wa la fi as-sama’ wa huwa as-sami’ al-‘alim.", "Nel nome di Allah, con il cui nome nulla può recare danno né sulla terra né nei cieli, ed Egli è l’Audiente, l’Onnisciente.", 3);
        Azkar azkar19 = new Azkar("evening", "أَعُوذُ بِكَلِمَاتِ اللَّهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَ.", "A’udhu bikalimatillah at-tammati min sharri ma khalaq.", "Mi rifugio nelle perfette parole di Allah dal male di quanto Egli ha creato.", 3);
        Azkar azkar20 = new Azkar("evening", "اللَّهُمَّ بِكَ أَمْسَيْنَا، وَبِكَ أَصْبَحْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوتُ، وَإِلَيْكَ النُّشُورُ.", "Allahumma bika amsayna wa bika asbahna wa bika nahya wa bika namutu wa ilayka an-nushur.", "O Allah, con Te abbiamo vissuto questa sera, con Te abbiamo vissuto questa mattina, con Te viviamo, con Te moriamo, e a Te sarà la resurrezione.", 1);
        Azkar azkar21 = new Azkar("evening", "اللَّهُمَّ أَنْتَ رَبِّي، لَا إِلَـٰهَ إِلَّا أَنْتَ، عَلَيْكَ تَوَكَّلْتُ، وَأَنْتَ خَيْرُ الرَّازِقِينَ.", "Allahumma anta rabbi, la ilaha illa anta, ‘alayka tawakkaltu, wa anta khayru ar-razqeen.", "O Allah, Tu sei il mio Signore, non c'è altro dio all'infuori di Te, in Te ripongo la mia fiducia, Tu sei il migliore dispensatore di provvidenza.", 1);
        Azkar azkar22 = new Azkar("evening", "رَضِيتُ بِاللَّهِ رَبًّا، وَبِالْإِسْلَامِ دِينًا، وَبِمُحَمَّدٍ نَبِيًّا.", "Radeetu billahi rabban, wa bil-Islami dinan, wa bi-Muhammadin nabiyyan.", "Sono soddisfatto di Allah come mio Signore, dell’Islam come mia religione e di Muhammad come mio profeta.", 3);
        Azkar azkar23 = new Azkar("evening", "اللَّهُمَّ إِنِّي أَسْأَلُكَ خَيْرَ هَذِهِ اللَّيْلَةِ، وَخَيْرَ مَا بَعْدَهَا، وَأَعُوذُ بِكَ مِنْ شَرِّ هَذِهِ اللَّيْلَةِ، وَشَرِّ مَا بَعْدَهَا.", "Allahumma inni as’aluka khayra hathihi al-laylah, wa khayra ma ba’daha, wa a’udhu bika min sharri hathihi al-laylah, wa sharri ma ba’daha.", "O Allah, Ti chiedo il bene di questa notte e il bene che la segue, e mi rifugio in Te dal male di questa notte e dal male che la segue.", 1);
        Azkar azkar24 = new Azkar("evening", "اللَّهُمَّ إِنِّي أَسْأَلُكَ العَفْوَ وَالعَافِيَةَ فِي الدُّنْيَا وَالآخِرَةِ.", "Allahumma inni as’aluka al-‘afwa wa al-‘afiyah fi ad-dunya wa al-akhirah.", "O Allah, Ti chiedo il perdono e il benessere in questa vita e nell'aldilà.", 3);
        Azkar azkar25 = new Azkar("evening", "اللَّهُمَّ إِنِّي أَمْسَيْتُ أُشْهِدُكَ، وَأُشْهِدُ حَمَلَةَ عَرْشِكَ، وَمَلائِكَتَكَ، وَجَمِيعَ خَلْقِكَ، أَنَّكَ أَنْتَ اللَّهُ لا إِلَهَ إِلَّا أَنْتَ، وَحْدَكَ لا شَرِيكَ لَكَ، وَأَنَّ مُحَمَّدًا عَبْدُكَ وَرَسُولُكَ.", "Allahumma amsaytu ushiduka, wa ushidu hamalata ‘arshika, wa malaa’ikataka, wa jamee’a khalkika, annaka anta Allah, la ilaha illa anta, wahdaka la shareeka laka, wa anna Muhammadan ‘abduka wa rasuluka.", "O Allah, questa sera do testimonianza che Tu sei Allah, non c'è altro dio all'infuori di Te, Tu sei Uno, non hai nessun partner, e Muhammad è il Tuo servo e il Tuo messaggero.", 1);
        Azkar azkar26 = new Azkar("evening", "اللَّهُمَّ إِنِّي أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً.", "Allahumma inni as’aluka ‘ilman nafi’an, wa rizqan tayyiban, wa ‘amalan mutaqabbalan.", "O Allah, Ti chiedo una conoscenza utile, un sostentamento puro e opere accettate.", 1);
        Azkar azkar27 = new Azkar("evening", "قُلْ أَعُوذُ بِرَبِّ ٱلْفَلَقِ مِن شَرِّ مَا خَلَقَ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ وَمِن شَرِّ ٱلنَّفَّـٰثَـٰتِ فِى ٱلْعُقَدِ وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ.", "Qul a'udhu birabbi al-falaq, min sharri ma khalaq, wa min sharri ghasiqin idha waqab, wa min sharri an-naffathati fi al-'uqad, wa min sharri hasidin idha hasad.", "Dì: Mi rifugio nel Signore dell'alba nascente, dal male di quanto Egli ha creato, dal male di una notte profonda quando diventa oscura, dal male di chi soffia sui nodi, dal male dell'invidioso quando invidia. (Surah Al-Falaq, 113)", 3);
        Azkar azkar28 = new Azkar("evening", "قُلْ هُوَ ٱللَّهُ أَحَدٌ ٱللَّهُ ٱلصَّمَدُ لَمْ يَلِدْ وَلَمْ يُولَدْ وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌۢ.", "Qul huwa Allahu ahad, Allahu assamad, lam yalid wa lam yulad, wa lam yakun lahu kufuwan ahad.", "Dì: Egli, Allah, è Unico, Allah è l'Assoluto. Non ha generato, né è stato generato, e nessuno è eguale a Lui. (Surah Al-Ikhlas, 112)\n", 3);
        Azkar azkar29 = new Azkar("evening", "قُلْ أَعُوذُ بِرَبِّ ٱلنَّاسِ مَلِكِ ٱلنَّاسِ إِلَـٰهِ ٱلنَّاسِ مِن شَرِّ ٱلْوَسْوَاسِ ٱلْخَنَّاسِ ٱلَّذِى يُوَسْوِسُ فِى صُدُورِ ٱلنَّاسِ مِنَ ٱلْجِنَّةِ وَٱلنَّاسِ.", "Qul a'udhu birabbi an-nas, maliki an-nas, ilahi an-nas, min sharri al-waswas al-khannas, allathee yuwaswisu fi suduri an-nas, mina al-jinnati wa an-nas.", "Dì: Mi rifugio nel Signore degli uomini, nel Sovrano degli uomini, nel Dio degli uomini, dal male del sussurratore furtivo che sussurra nei cuori degli uomini, tra i jinn e tra gli uomini. (Surah An-Nas, 114)\n", 3);
        Azkar azkar30 = new Azkar("evening", "اللَّهُمَّ إِنِّي أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً.", "Allahumma inni as’aluka ‘ilman nafi’an, wa rizqan tayyiban, wa ‘amalan mutaqabbalan.", "O Allah, Ti chiedo una conoscenza utile, un sostentamento puro e opere accettate.", 1);
        Azkar azkar31 = new Azkar("evening", "أمسينا وأمسى الملك لله رب العالمين ، اللَّهُمَّ إِنِّي أَسْأَلُكَ خَيْرَ هَذِهِ اللَّيْلَةِ فَتْحَهَا وَنَصْرَهَا وَنُورَهَا وَبَرَكَتَهَا وَهُدَاهَا وَأَعُوذُ بِكَ مِنْ شَرِّ مَا فِيهَا وَشَرِّ مَا بَعْدَهَا.", "Am-sayna wa amsa al-mulku lillahi Rabb al-'Alamin, Allahumma inni as-aluka khayra hadhihi al-lailati fat-haha wa nasraha wa nuraha wa barakataha wa huda-ha wa a'udhu bika min sharri ma fiha wa sharri ma ba'daha.", "Siamo entrati e il regno appartiene a Allah, Signore dei mondi. O Allah, Ti chiedo il bene di questa notte, la Sua apertura, il Suo aiuto, la Sua luce, la Sua benedizione, la Sua guida e cerco rifugio in Te dal suo male e dal male che segue.", 1);
        Azkar azkar32 = new Azkar("evening", "سُبْحَانَ اللَّهِ وَبِحَمْدِهِ.", "SubhanAllahi wa bihamdihi.", "Gloria e lode ad Allah.", 100);
        Azkar azkar33 = new Azkar("evening", "أَسْتَغْفِرُ اللَّهَ وَأَتُوبُ إِلَيْهِ.", "Astaghfirullaha wa atubu ilayh.", "Chiedo perdono ad Allah e mi pento a Lui.", 100);

        entityManager.getTransaction().begin();

        // Salvataggio degli oggetti Azkar nel database
        entityManager.persist(azkar1);
        entityManager.persist(azkar2);
        entityManager.persist(azkar3);
        entityManager.persist(azkar4);
        entityManager.persist(azkar5);
        entityManager.persist(azkar6);
        entityManager.persist(azkar7);
        entityManager.persist(azkar8);
        entityManager.persist(azkar9);
        entityManager.persist(azkar10);
        entityManager.persist(azkar11);
        entityManager.persist(azkar12);
        entityManager.persist(azkar13);
        entityManager.persist(azkar14);
        entityManager.persist(azkar15);
        entityManager.persist(azkar16);
        entityManager.persist(azkar17);
        entityManager.persist(azkar18);
        entityManager.persist(azkar19);
        entityManager.persist(azkar20);
        entityManager.persist(azkar21);
        entityManager.persist(azkar22);
        entityManager.persist(azkar23);
        entityManager.persist(azkar24);
        entityManager.persist(azkar25);
        entityManager.persist(azkar26);
        entityManager.persist(azkar27);
        entityManager.persist(azkar28);
        entityManager.persist(azkar29);
        entityManager.persist(azkar30);
        entityManager.persist(azkar31);
        entityManager.persist(azkar32);
        entityManager.persist(azkar33);


        // Fine della transazione
        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();

    }
}
