# sequences
Stream processing of sequence data using AWS Lambda

# Objective
Create a data flow stream that accepts sequence chunks and processes them using
Probabilistic Suffix Trees (PSTs) to identify anomalous "words" and predict possible
alternatives from a living "vocabulary".

# Current Research
Explore an example genomic data sequence from the NCBI Genomic Workbench. These files are
binary representations of sequence alignment data (SAM) files, thus the naming convention
BAM. This is a proof of concept that will test/evaluate how well PST can support various
aspects of dealing with differing sequence data types including genomic, OCR text,
and speech-to-text.

# Design
The actor model wil provide a good framework for this research because it helps separate
loosely coupled functionality and maintain immutable, concurrent, resilient, parallel applications.
The software design will have a "reader" that simulates the stream, several coordinators to
manage the parallel sequence processing, and sequence processors that work on limited chunks
updating the database with findings. Using AWS Lambda will help keep the development of
the processors focused and restricted to a primary requirement.
