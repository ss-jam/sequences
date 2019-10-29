# sequences
Stream processing of sequence data using Probabilistic Suffix Tree (PST) with AWS Lambda

## Objective
Create a data flow stream that accepts sequence chunks and processes them using
PSTs to identify anomalous "words" and predict possible
alternatives from a living "vocabulary".

## Current Research
There is a growing research into PST use in many differing industries and on the data types
they use. In the genomic realm, this initial work will center on [*Sequence Motif Identification
and Protein Family Classification using Probabilistic Trees*](https://www.researchgate.net/publication/221322803_Sequence_Motif_Identification_and_Protein_Family_Classification_Using_Probabilistic_Trees) and [*Finding DNA Motifs: A
Probabilistic Suffix Tree Approach*](https://digitalcommons.unl.edu/cgi/viewcontent.cgi?article=1143&context=computerscidiss).

As a beginning, we will explore an example genomic data sequence from the NCBI Genomic Workbench.
These files are binary representations of sequence alignment data (SAM) files, thus the naming convention
BAM. This is a proof of concept that will test/evaluate how well PST can support various
aspects of dealing with differing sequence data types including genomic, OCR text,
and speech-to-text.

## Design
The actor model wil provide a good framework for this research because it helps separate
loosely coupled functionality and maintain immutable, concurrent, resilient, parallel applications.
The software design will have a "reader" that simulates the stream, several coordinators to
manage the parallel sequence processing, and sequence processors that work on limited chunks
updating the database with findings. Using AWS Lambda will help keep the development of
the processors focused and restricted to a primary requirement.

## Approach
The implementation of the proof of concept will first, leverage previous work in applying PSTs to network data.
This will move to tailoring the code to support genomic data, and eventually other data types as described above.
Along the way, current and emerging advancements in technology, research, and application will guide and influence
refactoring and focus. For example, [Akka Streams](https://doc.akka.io/docs/akka/current/stream/index.html?_ga=2.113032708.1672786962.1572317565-985171420.1572317565)
appears to be a promising technology supporting the overall goals.

 